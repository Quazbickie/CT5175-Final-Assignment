import java.util.Scanner;

public class PascalsTriangleRecursive {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many rows would you like in the triangle?");
        int numRows = myScanner.nextInt();
        int pascalsTriangle[][] = new int[numRows][numRows];
        pascalsTriangle[0][0] = 1;

    }



}
