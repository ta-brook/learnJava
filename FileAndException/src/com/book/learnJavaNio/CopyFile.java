package com.book.learnJavaNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class CopyFile {
    public static void main(String[] args) {
        try {

            System.out.println("Started:"+new Date());

            Path source = Paths.get("somefile.zip");
            Path destination = Paths.get("Dataset/pasted.zip");

            Files.copy(source, destination);

            System.out.println("Completed:"+new Date());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
