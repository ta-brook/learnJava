package com.book.learnJavaNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("Dataset/test.txt");
            if(Files.exists(p)) {
                System.out.println("File already eixsts");
            } else {
                Path donePath = Files.createFile(p);
                System.out.println("File is created: "+donePath.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
