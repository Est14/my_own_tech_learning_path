package model;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Constructor Method
    public Patient(String name, String email){
        super(name, email);
    }

    // Over write the toString method


    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Birthday = "  + birthday +
                '\n' +
                '}';
    }

    // Getters and Setters
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
