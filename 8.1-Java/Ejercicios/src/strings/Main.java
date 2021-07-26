package strings;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2021, Colors.BLACK);
        System.out.println(myCar);
        myCar.setType(CarType.PICKUP);
        System.out.println(myCar);
    }
}
