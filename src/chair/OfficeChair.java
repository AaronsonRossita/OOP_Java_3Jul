package chair;

public class OfficeChair extends Chair{

    private boolean isAllowedAdjustments;
    private boolean isSpinning;
    private boolean hasDiscount;
    private int discount;

    public OfficeChair(double price, boolean isAllowedAdjustments, boolean isSpinning, boolean hasDiscount, int discount) {
        super("Office", 1, price);
        this.isAllowedAdjustments = isAllowedAdjustments;
        this.isSpinning = isSpinning;
        this.hasDiscount = hasDiscount;
        this.discount = discount;
    }

    public boolean isAllowedAdjustments() {
        return isAllowedAdjustments;
    }

    public void setAllowedAdjustments(boolean allowedAdjustments) {
        isAllowedAdjustments = allowedAdjustments;
    }

    public boolean isSpinning() {
        return isSpinning;
    }

    public void setSpinning(boolean spinning) {
        isSpinning = spinning;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public double calculatePrice(int numberOfChairs) {
        double beforeDiscount = super.calculatePrice(numberOfChairs);
//        if (hasDiscount){
//            return beforeDiscount - (beforeDiscount * discount / 100);
//        }else{
//            return beforeDiscount;
//        }
        //          if                  true                                          false
        return hasDiscount ? beforeDiscount - (beforeDiscount * discount / 100) : beforeDiscount;
    }

    @Override
    public String toString() {
        return hasDiscount ? super.toString() + " and it has a discount of " + discount : super.toString();
    }
}
