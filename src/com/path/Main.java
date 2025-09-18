// Java program to find absolute path to Desktop

package com.path;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating FileSystemView entity
        FileSystemView view = FileSystemView.getFileSystemView();

        // Creating file to find home directory
        File file = view.getHomeDirectory();

        // Creating string to store path
        String path;

        // Initializing path
        path = file.getPath();

        // Printing path to console
        System.out.print(path);

    }
}