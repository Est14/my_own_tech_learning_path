public class WhileLoop {

    static boolean isTurn = false;

    public static void main(String[] args) {

        turnOnOfLight();
        int i = 0;
        while(isTurn && i <10){
            printSOS();
            i++;
        }

    }

    public static void printSOS(){
        System.out.println("...---...");
    }

    public static boolean turnOnOfLight(){

        isTurn = (!isTurn)?true:false;

        return  isTurn;
    }
}
