public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }
    public Fish(String name) {
        super(0);
        setName(name);
    }

    @Override
    void eat() {
        System.out.printf("Fish " + this.name + " is eating");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.printf("Fish " + this.name + " is playing");
    }
}
