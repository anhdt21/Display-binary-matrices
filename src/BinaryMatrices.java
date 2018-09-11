import java.util.Random;
import java.util.Scanner;

public class BinaryMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        int[][] numbers = new int[n][n];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random()*2);
            }
        }
        int i = 0;
        while (i < numbers.length) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
            i++;
        }
    }
}
