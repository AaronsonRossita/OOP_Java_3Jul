public class Car extends Vehicle{

    private String type;

    public Car(String engine, int wheelsAmount, String type) {
        super(engine, wheelsAmount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
