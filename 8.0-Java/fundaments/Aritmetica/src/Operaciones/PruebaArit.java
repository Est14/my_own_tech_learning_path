
package Operaciones;

public class PruebaArit {
    
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 10;
        aritmetica1.b = 5;
        
        aritmetica1.sum();
        aritmetica1.sus();
        aritmetica1.mul();
        aritmetica1.div();
        
        int resultdoSuma = aritmetica1.sumar();
        System.out.println(resultdoSuma);
        
        int resultMul = aritmetica1.mulConRetorno(3, 4);
        System.out.println(resultMul);
        
    }
    
}
