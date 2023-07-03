public class Vehicle {

    private String engine;
    private int wheelsAmount;


    public Vehicle(String engine, int wheelsAmount) {
        this.engine = engine;
        this.wheelsAmount = wheelsAmount;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }
}
