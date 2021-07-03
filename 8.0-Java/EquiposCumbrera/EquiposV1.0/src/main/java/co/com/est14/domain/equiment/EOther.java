package co.com.est14.domain.equiment;

public class EOther extends Equipment {

    private double amount;

    public EOther(String equipmentName, double equipmentValue) {
        super(equipmentName, equipmentValue);
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
