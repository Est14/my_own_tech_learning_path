package co.com.est14.domain.equiment;

public class EForm extends Equipment {

    private int amount;

    public EForm(String equipmentName, double equipmentValue, int amount) {
        super(equipmentName, equipmentValue);
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
