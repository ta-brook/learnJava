// class - class -> extends
// class -> interace -> implements
// class -> interface -> extends



public class Main {
    public static void main(String a[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
        
        System.out.println(A.area);
    }
}

class B implements A,Y {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("run");
    }

}

interface A {
    int age=44; // final and static
    String area="Bangkok";
    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {
    
}

