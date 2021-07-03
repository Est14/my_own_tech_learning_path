package co.com.est14.domain.equiment;

import java.util.Date;

public abstract class Equipment {

    private int equipmentCode;
    protected String equipmentName;
    protected double equipmentValue;
    private Date date;
    private boolean status;
    private static int counterCode;


    private Equipment(){
        ++Equipment.counterCode;
    }

    public Equipment(String equipmentName, double equipmentValue) {
        this();
        this.equipmentCode = Equipment.counterCode;
        this.equipmentName = equipmentName;
        this.equipmentValue = equipmentValue;
        this.date = new Date();
        this.status = true;
    }

    public int getEquipmentCode() {
        return equipmentCode;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public double getEquipmentValue() {
        return equipmentValue;
    }

    public void setEquipmentValue(double equipmentValue) {
        this.equipmentValue = equipmentValue;
    }

    public Date getDate() {
        return date;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
