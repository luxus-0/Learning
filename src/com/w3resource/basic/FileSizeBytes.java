package com.w3resource.basic;

/*
* Write a Java program to find the size of a specified file
*
* Sample Output:
/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes
* */

import java.io.File;
import java.io.IOException;

public class FileSizeBytes {

    private static File file;

    private static String printSizeFileInBytes(String path) throws IOException {
        file = new File(path);
        if(!file.exists()){
            boolean create = file.createNewFile();
            System.out.println("Created file: " +create);
        }
        return file.length() + " bytes";
    }

    public static void main(String[] args) throws IOException {
        String pathFile = "d:/file.txt";
        String sizeFileInBytes = printSizeFileInBytes(pathFile);
        System.out.println(pathFile + " : " + sizeFileInBytes);
    }


}
