public class Parrot extends Bird implements Flyable{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("This parrot named " + this.getName() + " is walking");
    }

    @Override
    public void flapWings() {
        System.out.println("This parrot named " + this.getName() + " is flapping its wings");
    }

    @Override
    public void fly() {
        System.out.println("This parrot named " + this.getName() + " is flying");
    }
}
