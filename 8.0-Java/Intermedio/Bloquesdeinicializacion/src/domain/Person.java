package domain;

public class Person {

    private final int idPerson;
    private static int personNumber;

    //Static block initialization
    // This just execute once
    static{
        System.out.println("Static block execution");
        ++Person.personNumber;
    }

    // Not Static block
    // This execute each time that object is create
    {
        System.out.println("NO static block execution");
        this.idPerson = Person.personNumber++;
    }

    public Person(){
        System.out.println("Construct execution");
    }

    public int getIdPerson(){
        return this.idPerson;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("idPerson=").append(idPerson);
        sb.append('}');
        return sb.toString();
    }
}
