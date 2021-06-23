import data.DAOPerson;

public class TestHandlePeople {

    public static void main(String[] args) {
        DAOPerson person = new DAOPerson();
        var people = person.select();
        for (var p:people) {
            System.out.println(p);
        }
    }
}
