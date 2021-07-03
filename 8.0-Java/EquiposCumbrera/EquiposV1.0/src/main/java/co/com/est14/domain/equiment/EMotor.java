package co.com.est14.domain.equiment;

public class EMotor extends Equipment {

    private int amount;
    private String equipmentSerial;
    private String equipmentModel;
    private static final int MAX_AMOUNT = 1;

    public EMotor(String equipmentName, double equipmentValue, String equipmentSerial, String equipmentModel) {
        super(equipmentName, equipmentValue);
        this.amount = MAX_AMOUNT;
        this.equipmentSerial = equipmentSerial;
        this.equipmentModel = equipmentModel;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getEquipmentSerial() {
        return this.equipmentSerial;
    }

    public void setEquipmentSerial(String equipmentSerial) {
        this.equipmentSerial = equipmentSerial;
    }

    public String getEquipmentModel() {
        return this.equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }
}
