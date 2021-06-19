package domain;

import java.util.Objects;

public class Worker {

    protected String name;
    protected double salary;
    private int idName;
    private static int nameCounter;

    public Worker(){
        this.idName = ++Worker.nameCounter;
    }
    public Worker(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdName() {
        return idName;
    }


    public static int getNameCounter() {
        return nameCounter;
    }




    public String getDetails(){

        return "Name: " + this.name +
                "\n" +
                "Salary: " + this.salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.salary, salary) == 0 && getIdName() == worker.getIdName() && getName().equals(worker.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), salary, getIdName());
    }
}
