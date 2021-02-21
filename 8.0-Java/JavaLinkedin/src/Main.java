import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Reference type
        String studentName = "Esteban Martinez";

        //Primitive type
        int studentAge = 29;
        var isActive = true;
        double studentGPA = 4.20;
        char studentFirstInitial = studentName.charAt(0);

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentName+"\n"+"Age: "+studentAge+"\n"+"GPA: "+studentGPA);
        System.out.println(studentFirstInitial);
    }

}
