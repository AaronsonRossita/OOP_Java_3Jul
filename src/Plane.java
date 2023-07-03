public class Plane extends Vehicle implements Flyable{


    public Plane(String engine, int wheelsAmount) {
        super(engine, wheelsAmount);
    }

    @Override
    public void fly() {
        System.out.println("This plane is flying");
    }
}
