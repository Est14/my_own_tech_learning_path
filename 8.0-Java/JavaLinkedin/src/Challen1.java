import java.util.Scanner;

public class Challen1 {
    public static void main(String[] args) {
        System.out.println("Question Challenge\n" +
                "What of these country are located in America\n" +
                "A) Mexico\n"+
                "B) Uruguay\n" +
                "C) España"
        );

        Scanner scanner = new Scanner(System.in);
        var bi = true;

        while (bi){
            String input = scanner.next();
            if (input.equals("A")){
                System.out.println("Congrats you are right Mexico is located in America");
                bi = false;
            }
            else if (input.equals(("B"))){
                System.out.println("Congrats you are right Uruguay is located in America");
                break;
            }
            else if (input.equals("C")){
                System.out.println("You fail España is located in Europe");
                break;
            }
            else {
                System.out.println("Please select a valid option A, B or C");
            }
        }

    }
}
