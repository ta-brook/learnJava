public class Main {
    public static void main(String a[]) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer book = new Developer();
        book.devApp(lap);
    }
}

// abstract class Computer {
//     public abstract void code();
// }

interface Computer {
    void code();
}

class Laptop implements Computer{
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code() {
        System.out.println("faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}
