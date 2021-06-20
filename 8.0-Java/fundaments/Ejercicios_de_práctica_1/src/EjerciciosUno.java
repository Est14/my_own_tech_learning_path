public class EjerciciosUno {

    public static void main(String[] args) {

        // Declarando los 3 arreglos e inicializandolos
        int[] arrayOne = {2,5,4,89,12,4,0};
        int[] arrayTwo = {11,22,8,9,1,55,41};
        int[] arrayThree = new int[7];
        int sumaValores = 0;

        // Iterando los dos primeros arreglos para completara el tercero
        for (int i = 0; i < arrayOne.length; i++) {
           arrayThree[i] = arrayOne[i] + arrayTwo[i];
           sumaValores += arrayThree[i] + arrayOne[i] + arrayTwo[i];
        }

        // Calculando promedio de los tres arrays:
        System.out.println("Promedio de todo los datos de los 3 arreglos: " + sumaValores / (arrayOne.length * 3));

        // Imprimiendo valores del array No 3
        System.out.println("Valores Array Tres:");
        for(int num: arrayThree){
            System.out.print(num);
            System.out.print(' ');
        }
    }
}
