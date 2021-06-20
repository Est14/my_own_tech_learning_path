import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arreglo = {88, 22, 0, 15, 9, 77, 4, 33, 23};

        Queue newQueue = new Queue();

        for (int i = 0; i < 5; i++) {
            newQueue.push(arreglo[i]);
        }
        System.out.println("\n------ Queue Class------\n");
        System.out.println("Tamaño de la pila: " + newQueue.sizeOfQueue());
        newQueue.pop();
        System.out.println("Eliminando un dato ...");
        int newSize = newQueue.sizeOfQueue();
        System.out.println("Nuevo de la pila: " + newSize);
        int spaceFree = arreglo.length - newSize;
        System.out.println("Puede agregar " + spaceFree + " Datos más a la pila");

        System.out.println("\n------ Stack Class------\n");
        Stack newStack1 = new Stack();
        Stack newStack2 = new Stack();
        newStack1.push(55);
        newStack1.push("Esteban");
        newStack1.push(100);
        newStack1.push(true);
        newStack1.push(23.32);
        newStack1.push("Santiago");
        newStack1.push("Daniela");

        Stack copy = new Stack();
        for (var elem: newStack1){
            copy.push(elem);
        }
        for (int i = copy.size() - 1; i >= 0 ; i--) {
            newStack2.push(copy.pop());
        }
        System.out.println("Pila 1" + newStack1);
        System.out.println("Pila 2" + newStack2);
    }
}
