import java_basics.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        // int x = 98;
        // int y = 0;
        // System.out.println(dividLBYL(x, y));
        // System.out.println(divideEAFP(x, y));
        // System.out.println(divide(x,y));
        // int x = getInt();
        // int x = getIntLBYL();
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

/*
 *  LBYL = Look before you leave
 *  EAFP = easy to ask for forgiveness than permission
 *  
 *  LBYL -> testing to make sure that the value that we're dividing by isn't 0
 *  EAFP ->  check the exception that raised by dividing by 0
 */


    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an interger");
        String input = s.next();
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter an integer");
        try {
            return s.nextInt();
        } catch(InputMismatchException e ) {
            return 0;
        }
    }

    
    private static int dividLBYL(int x, int y) {
        if(y != 0){
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}

