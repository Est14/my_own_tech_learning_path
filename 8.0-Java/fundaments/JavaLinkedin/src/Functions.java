import java.util.Scanner;

public class Functions {
    public static void announceDeveloperTeatime(){
        System.out.println("Waiting for Developer Tea Time ;)");
        System.out.println("Type in a random word and press to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time ;)");
    }
    public static  double calculateTotalMealPrice(double listedMealPrice){
        double tipRate = 0.10;
        double taxRate = 0.19;
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tax + tip;
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("You total price for meal is: " +
                calculateTotalMealPrice(35000));
    }
}
