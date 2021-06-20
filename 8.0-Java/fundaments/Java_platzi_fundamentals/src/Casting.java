public class Casting {

    public static void main(String[] args) {
        double x = 5.9;
        int y = (int) x;

        System.out.println(y);

        char c = '1';
        //This value is 49 because 1 is 49 in ascii table
        int num = c;

        int i = 200;
        long iL = i;
        short iS = (short) iL;
        double d = 301.067;
        long dL = (long) d;
        int i2 = 100;
        float i2F = i2 + 5000.66F;

    }
}
