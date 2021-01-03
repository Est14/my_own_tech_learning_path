
public class operators {

	public static void main(String[] args) {

		final double PI = 3.1416;
		// Importante si quiero hacer operaciones con decimales debo trabajar con double.
		double num = 7;
		double num1 = num / 5;
		num++;
		double num2 = 10;
		num2 *= 10;
		num2 /= 2;

		System.out.println(PI);
		System.out.println(num);
		System.out.println(num1);
		
		// Operacion de contatenacion: +
		System.out.println("Despues de las" + "Operaciones " + "el resultado es: " + num2);
	}

}
