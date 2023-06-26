package com.book.learnJavaNio;

import java.nio.file.*;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet/newFile1.txt");
            // Path donePath1=Files.createFile(p);

            for(int i=0; i<=10; i++){
                String content = "appending text" + "-->" + i ;
            
                Files.write(p, content.getBytes(), StandardOpenOption.APPEND);
                Files.write(p, System.getProperty("line.separator").getBytes(),StandardOpenOption.APPEND);
            }
            
            System.out.println("Data Written as byte arrays");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
