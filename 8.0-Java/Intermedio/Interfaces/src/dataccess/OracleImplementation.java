package dataccess;

public class OracleImplementation implements IADataAccess{

    @Override
    public void add() {
        System.out.println("Insert from Oracle");
    }

    @Override
    public void list() {
        System.out.println("List from Oracle");
    }

    @Override
    public void update() {
        System.out.println("Update from Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Delete from Oracle");
    }
}
