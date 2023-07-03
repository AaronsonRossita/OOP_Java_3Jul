public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("This cat named " + this.getName() + " is walking");
    }
}
