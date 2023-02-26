package Lecture5.B;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        try {
        d.walk();

        }catch (UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
        }
        d.eat();
        d.play();
       c.walk();
       c.eat();
       c.play();
       a.eat();
        try {
            a.walk();

        }catch (UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
        }
        e.eat();
        e.walk();
        p.play();


    }
}
