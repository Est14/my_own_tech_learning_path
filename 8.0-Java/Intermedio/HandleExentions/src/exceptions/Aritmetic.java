package exceptions;

public class Aritmetic {
    public static double division(int n, int d) throws ExceptionOperation {
        if(d == 0){
            throw new ExceptionOperation("Division by 0");
        }
        return n / d;
    }
}
