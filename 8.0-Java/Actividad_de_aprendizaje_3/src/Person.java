public class Person {
    /**
     * Description: Super class person
     */

    protected String name;
    protected String lastName;
    protected String dateOfBird;
    protected char gender;
    protected Double height;
    protected Double weight;

    public Person(String name, String lastName, String dateOfBird,
            char gender, Double height, Double weight){
        this.name = name;
        this.lastName = lastName;
        this.dateOfBird = dateOfBird;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }


}
