package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        printNumbers(5, 77, 12, 3);
        printNumbers(4,1,6,23);
        System.out.println();
        printStrings("Esteban", "Computers", "Code", "Travel", "Food");
    }

    //The variable argue could be the last
    private static void printStrings(String name, String ... likes){
        System.out.println("Name :" + name);
        for (int i = 0; i < likes.length; i++) {
            System.out.println("Like #"+(i+1)+" "+likes[i]);
        }
    }
    private static void printNumbers(int ... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element: " + numbers[i]);
        }
    }
}
