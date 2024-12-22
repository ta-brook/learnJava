class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}


// static only can be used as inner Class ?

public class Demo {
    public static void main(String a[]) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();
    }
    
}



