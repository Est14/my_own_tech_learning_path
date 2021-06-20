package co.com.est14.sales;

public class Run {

    public static void main(String[] args) {
        Product list[] = new Product[2];

        list[0] = new Product("Computer", 1500.22);

        for (int i = 0; i < list.length; i++) {

            System.out.println(list[i]);
        }
    }
}
