public abstract class Animal {
    protected int legs;

    public Animal(int legs){
        this.legs = legs;
    }

    abstract void eat();

    public void walk() {
        System.out.println("This animal walks on " + this.legs + " legs");
    }



}
