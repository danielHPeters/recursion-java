package recursion;

import java.io.File;

/**
 * Recursive filewalker printing all the directories and files found to the
 * console
 *
 * @author d.peters
 */
public class FileWalker {

    /**
     * Walks through all the files and directories
     *
     * @param path the directory path to be parsed
     */
    public void walk(String path) {

        File root = new File(path);
        File[] list = root.listFiles();

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
