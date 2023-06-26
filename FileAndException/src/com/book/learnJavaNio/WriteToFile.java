package com.book.learnJavaNio;

import java.io.File;
import java.nio.file.*;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Path p = Paths.get("DataSet/newFile1.txt");
            // Path donePath1=Files.createFile(p);

            // String content = "Hey coding owls";
            
            // Files.write(donePath1, content.getBytes());
            // System.out.println("Data Written as byte arrays");

            // write to newfile2.txt with data from test.txt
            Path p2 = Paths.get("DataSet/newFile2.txt");
            Path donePath2=Files.createFile(p2);

            Path p3 = Paths.get("Dataset/test.txt");
            List<String> data=Files.readAllLines(p3);

            Files.write(donePath2, data);
            System.out.println("Data Written in file using list of string");



        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
