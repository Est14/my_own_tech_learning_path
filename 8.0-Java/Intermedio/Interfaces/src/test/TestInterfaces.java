package test;

import dataccess.IADataAccess;
import dataccess.MySqlImplementation;
import dataccess.OracleImplementation;

public class TestInterfaces {
    public static void main(String[] args) {
        IADataAccess data = new MySqlImplementation();
        IADataAccess data2 = new OracleImplementation();
    }
}
