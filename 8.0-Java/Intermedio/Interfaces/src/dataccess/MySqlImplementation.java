package dataccess;

public class MySqlImplementation implements IADataAccess {


    @Override
    public void add() {
        System.out.println("Insert from Mysql");
    }

    @Override
    public void list() {
        System.out.println("List from Mysql");
    }

    @Override
    public void update() {
        System.out.println("Update from Mysql");
    }

    @Override
    public void delete() {
        System.out.println("Delete from Mysql");
    }
}
