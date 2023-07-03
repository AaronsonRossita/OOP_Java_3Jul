package chair;
public class Chair {

    private String model;
    private int numberOfLegs;
    private double  price;

    public Chair(String model, int numberOfLegs, double price) {
        this.model = model;
        this.numberOfLegs = numberOfLegs;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // "This chair model - ___, has __ legs and costs __ "


    @Override
    public String toString() {
        return String.format("This chair model is \"%s\", has %s legs and costs %s",model,numberOfLegs,price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chair){
            Chair temp = (Chair) obj;
//            if(this.model.equals(temp.getModel()) && this.price == temp.getPrice() && this.numberOfLegs == temp.getNumberOfLegs()){
//                return true;
//            }else{
//                return false;
//            }
            return this.model.equals(temp.getModel()) && this.price == temp.getPrice() && this.numberOfLegs == temp.getNumberOfLegs();
        }else{
            return false;
        }
    }

    public double calculatePrice(int numberOfChairs){
        return numberOfChairs * price;
    }
}
