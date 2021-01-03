
public class operators2 {
    public static void main(String[] args) {
        
        // Raiz con el metodo sqrt
        double raiz = Math.round(Math.sqrt(989));

        float num = 45.7F;
        int num1 = Math.round(num);

        double num2 = 33.333;

        // De esta forma se parsea un numero
        int num3 = (int)num2;

        // Potencia con el metodo pow

        double base = 5;
        double exponente = 5;

        int result = (int)(Math.pow(base,exponente));

        System.out.println(raiz);
        System.out.println(num1);
        System.out.println(num3);
        System.out.println(result);
    
    }
}
