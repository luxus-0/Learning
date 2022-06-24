package com.w3resource.basic;

import java.io.File;
import java.io.IOException;

public class FileSizeKiloBytes {

    private static String printSizeFileInKiloBytes(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            boolean create = file.createNewFile();
            System.out.println("Created file: " +create);
        }
        return file.length() / 1024 + " kb";
    }

    public static void main(String[] args) throws IOException {
        String path = "d:/file.txt";
        String sizeKb = printSizeFileInKiloBytes(path);
        System.out.println(path + " : " + sizeKb);
    }
}
