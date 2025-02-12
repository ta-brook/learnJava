class BookException extends Exception
{
    public BookException(String string)
    {
        super(string);
    }
}

class A {
    public void show() throws ClassNotFoundException
    {
        Class.forName("calc");
    }

    // public void show(String[] args) {
    //     try {
    //         Class.forName("Demo");
    //     } catch(ClassNotFoundException e) {
    //         System.out.println("not able to find the classes");
    //     }
    }
}


public class Demo {
    static {
        System.out.println("Class laoded");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // int i = 1;
        // int j = 0;
        
        // try {
        //     j = 18/i;
        //     System.out.println(i);
        //     if (i==1)
        //         throw new BookException("I dont want to print zero");
        // }
        // catch(ArithmeticException e) {
        //     System.out.println("connot divide by zero:  " + e);
        //     j = 8/2;
        // }
        // catch(Exception e) {
        //     System.out.println("something went wrong: " + e);
        // }

        // System.out.println(j);
    }
}
