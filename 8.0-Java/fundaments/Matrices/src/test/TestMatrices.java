package test;

public class TestMatrices {

    public static void main(String[] args) {

        int numbers[][] = new int[2][6];

        int ages[][] = {
                {22, 30, 21, 18, 29, 28},
                {15, 17, 16, 18, 14, 12}
        };

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++){
                numbers[i][j] = ages[i][j];
            }
        }

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
