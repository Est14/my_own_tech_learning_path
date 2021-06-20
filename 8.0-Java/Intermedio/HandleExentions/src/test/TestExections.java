package test;


import static exceptions.Aritmetic.division;

public class TestExections {

    public static void main(String[] args) {
        double result = 0;
        try{
            result = division(10, 0);
        }catch(Exception e){
            System.out.println("Error: ");
            //Con esto mandamos toda la pila de mensajes
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        System.out.println("Result: " + result);
    }
}
