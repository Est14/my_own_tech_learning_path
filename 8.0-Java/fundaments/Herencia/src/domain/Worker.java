package domain;

public class Worker extends Person{

    private int IdWorker;
    private double salary;
    private static int counter;

    public Worker(){
        this.IdWorker = ++Worker.counter;
    }
    public Worker(String name, double salary) {
        //super(name);
        // LLamo al constructor vacio
        this();
        this.salary = salary;
        // Puedo accesder a los atributos de la clase padre
        this.name = name;
    }

    public int getIdWorker() {
        return this.IdWorker;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("name='").append(name).append('\'');
        sb.append(", IdWorker=").append(IdWorker);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
