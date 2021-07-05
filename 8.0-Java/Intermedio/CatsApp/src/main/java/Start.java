import javax.swing.*;

public class Start {

    public static void main(String[] args) {

        int optionMenu = -1;

        String[] bottoms = {"1. See cats", "2. Exit"};
        
        do {
            String options = (String) JOptionPane.showMessageDialog(null,
                    "Java Cats",
                    "Main menu",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    bottoms,
                    bottoms[0]);
        }while(optionMenu != 1);

    }

}
