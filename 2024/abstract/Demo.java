abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}

class UpgradeWagonR extends WagonR {
    public void fly() {
        System.out.println("fly");
    }
}

public class Demo {
    public static void main(String a[]) {
        Car obj = new UpgradeWagonR();
        obj.drive();
        obj.playMusic();
    }
}