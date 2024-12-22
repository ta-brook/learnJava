package com.book.learnJavaNio;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CreateDirectory {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet");
            
            if(Files.exists(p)) {
                System.out.println("Directory already exists");
            } else {
                Path donePath = Files.createDirectories(p);
                System.out.println("Directory created at "+donePath.toString());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
