package dominio;

public class Persona {

    private String name;
    private double salary;
    private boolean status;

    public Persona(String name, double salary, boolean status){
        this.name = name;
        this.salary = salary;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString(){

        return "Persona [name: " + this.name + " Salary: " + this.salary + " Status: " + this.status + "]";
    }
}
