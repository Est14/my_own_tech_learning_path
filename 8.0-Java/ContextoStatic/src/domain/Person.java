package domain;

public class Person {

    // Esta variable se asocia con los objectos
    private int idPerson;
    private String name;
    // Esta variable se asocia con la clase y no con los objectos
    private static int counterPeople;

    public Person(String name){
        this.name = name;
        Person.counterPeople++;
        this.idPerson = Person.counterPeople;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounterPeople() {
        return counterPeople;
    }

    public static void setCounterPeople(int counterPeople) {
        Person.counterPeople = counterPeople;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                '}';
    }
}
