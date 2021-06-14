import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int numberPiked = input.nextInt();

        if(numberPiked < 5){
            System.out.println("You lent me a soda");
        }
        if (numberPiked >= 5){
            System.out.println("I lent you a soda");
        }
    }
}
