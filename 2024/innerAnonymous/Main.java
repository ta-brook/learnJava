public class Main {
    public static void main(String a[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
    
}


class A {
    public void show(){
        System.out.println("in A sho");
    }
}

class B extends A {
    public void show(){
        System.out.println("show in B");
    }
}

