package Latihan;

class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}
class piranha extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}
public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new piranha();
        a.swim();
        b.swim();
    }
}
