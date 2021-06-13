public class Main {

    public static void main(String[] args) {

        Caja caja1 = new Caja();
        caja1.ancho = 4;
        caja1.alto = 7;
        caja1.profundo = 3;
        System.out.println("Volumen caja 1: " + caja1.calcularVolumen());
        System.out.println("---------");
        Caja caja2 = new Caja(2, 5, 8);
        System.out.println("Volumen caja 2: " + caja2.calcularVolumen());
    }
}
