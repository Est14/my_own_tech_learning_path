public class Student {

    String firstName;
    String lastName;
    int EYG;
    double GPA;
    boolean declaredMayor;

    Student(String firstName, String lastName,
            int EYG, double GPA,
            boolean declaredMayor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.EYG = EYG;
        this.GPA = GPA;
        this.declaredMayor = declaredMayor;
    }

    public void upEYG(){
        this.EYG ++;
    }

    public void printStudent(){
        System.out.println("Name: " + this.firstName + " " + this.lastName +
                "\n Expected Year to Graduate: " + this.EYG +
                "\n Current GPA: " + this.GPA +
                "\n Declared Mayor: " + this.declaredMayor);
    }
}
