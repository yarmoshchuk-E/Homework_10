import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task_1");
        int[] temperature = new int[]{1, 2, 3};
        double[] pressure = {1.57, 7.654, 9.986};
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89};
        System.out.println();

        System.out.println("Task_2");
        System.out.println(Arrays.toString(temperature));
        System.out.println(Arrays.toString(pressure));
        for (int p = 0; p < primeNumbers.length; p++) {
            if (p == primeNumbers.length - 1) {
                System.out.println(primeNumbers[p]);
                break;
            }
            System.out.print(primeNumbers[p] + ", ");
        }
        System.out.println();

        System.out.println("Task_3");
        System.out.print(temperature[2] + ", " + temperature[1] + ", " + temperature[0] + "\n");
        System.out.print(pressure[2] + ", " + pressure[1] + ", " + pressure[0] + "\n");
        for (int p = primeNumbers.length - 1; p >= 0; p--) {
            if (p == 0) {
                System.out.println(primeNumbers[p]);
                break;
            }
            System.out.print(primeNumbers[p] + ", ");
        }
        System.out.println();

        System.out.println("Task_4");
        for (int t = 0; t < temperature.length; t++) {
            if (temperature[t] % 2 != 0) {

                System.out.print((temperature[t] + 1) + ", ");
                continue;
            }
            System.out.print(temperature[t] + ", ");
        }
        System.out.println();
    }
}