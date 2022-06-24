package com.w3resource.basic;

import java.io.File;
import java.io.IOException;

public class FileSizeMegaBytes {

    private static String printSizeFileInMegaBytes(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            boolean create = file.createNewFile();
            System.out.println("Created file: " + create);
        }
        return file.length() / (1024 * 1024) + " mb";
    }

    public static void main(String[] args) throws IOException {
        String path = "d:/file.txt";
        String sizeMb = printSizeFileInMegaBytes(path);
        System.out.println(path + " : " + sizeMb);
    }
}
