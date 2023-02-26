abstract class Animal {
    protected int legs;
    public Animal(){

    }

    protected Animal(int legs) {
this.legs = legs;
    }
    public abstract void eat();
    public  void walk(){
        System.out.println("The animal walks with " + this.legs+ " legs");
    }

}
