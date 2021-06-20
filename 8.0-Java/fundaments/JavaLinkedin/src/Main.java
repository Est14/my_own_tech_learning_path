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

        //System.out.println(studentName+"\n"+"Age: "+studentAge+"\n"+"GPA: "+studentGPA);
        //System.out.println(studentFirstInitial);

        Triangle triangleA = new Triangle(15,8,15,8,17);
        System.out.println("Triangle area is:" + triangleA.findArea());

        Student esteban = new Student("Esteban", "Martinez", 2022, 4.23, true);
        Student santiago = new Student("Santiago", "Velandia", 2021, 3.9, true);

        santiago.upEYG();
        santiago.printStudent();
        esteban.printStudent();
    }

}
