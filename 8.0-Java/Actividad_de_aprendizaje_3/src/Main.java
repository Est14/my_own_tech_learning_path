public class Main {

    public static void main(String[] args) {
        /**
         * Description: this is the entry point of our program
         */

        // This is the store with capacity for 50 professors
        Proffesor[] teacher = new Proffesor[50];

        Proffesor professor = new Proffesor("Esteban", "Martinez",
                "30/06/90", 'M', 1.73, 69.0);

        teacher[0] = professor;

    }


}
