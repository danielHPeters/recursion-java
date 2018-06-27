package ch.peters.daniel.recursion;

import java.io.File;

/**
 * Recursive file walker printing all the directories and files found to the
 * console.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class FileWalker {
  /**
   * Walks through all the files and directories
   *
   * @param path The directory path to be parsed
   */
  public void walk(String path) {
    var root = new File(path);
    var list = root.listFiles();

    if (list != null) {
      for (File f : list) {
        if (f.isDirectory()) {
          walk(f.getAbsolutePath());
          System.out.println("Dir:" + f.getAbsoluteFile());
        } else {
          System.out.println("File:" + f.getAbsoluteFile());
        }
      }
    }
  }
}
