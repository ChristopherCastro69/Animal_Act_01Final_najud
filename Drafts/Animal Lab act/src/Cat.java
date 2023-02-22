public class Cat extends Animal implements Pet{
    private String name;

    public Cat(){
        super(4);
    }
    public Cat(String name){
        super(4);
        setName(name);
    }
    @Override
    void eat() {
        System.out.printf("Cat " + this.name + " is eating");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf("Cat " + this.name + " is playing");
    }

}
