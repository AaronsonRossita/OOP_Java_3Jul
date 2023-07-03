public class Bird extends Animal {


    public Bird(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("This bird named " + this.getName() + " is walking");
    }

    public void flapWings(){
        System.out.println("This bird named " + this.getName() + " is flapping its wings");
    }

}
