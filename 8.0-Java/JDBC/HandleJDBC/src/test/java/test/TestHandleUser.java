package test;

import data.DAOUser;
import domain.User;

import java.util.List;

public class TestHandleUser {

    public static void main(String[] args) {
        DAOUser user0 = new DAOUser();

        // Declaring users
        User user = new User("Esteban", "cam234");
        User user2 = new User("Santiago", "dar45");
        User user3 = new User("Miguel", "momo23");

        // Inserting users
        //user0.insert(user);
        //user0.insert(user2);
        //user0.insert(user3);

        // Update data
        User user4 = new User(2, "Nico", "nico1542");
        //user0.update(user4);

        // Delete user
        user0.delete(user4);

        // Select data
        List<User> users = user0.select();
        users.forEach(u -> {
            System.out.println(u);
        });

    }
}
