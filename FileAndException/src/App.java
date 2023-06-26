import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner input = new Scanner(System.in);
        // String enteredText = input.nextLine();
        // System.out.println(enteredText);

        try {
            File file = new File("myfile.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            } 
    
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            // e.printStackTrace();
        }

        MyFileUtils myUtils = new MyFileUtils();
        try {
            System.out.println(myUtils.subtract10FromLargerNumber(1));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

