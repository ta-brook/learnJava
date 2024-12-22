package com.book.learnJavaNio;

import java.util.*;
import java.nio.file.*;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("Dataset/test.txt");
            List<String> data=Files.readAllLines(p);
            
            for(String s:data)
            {
                System.out.println(s);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
