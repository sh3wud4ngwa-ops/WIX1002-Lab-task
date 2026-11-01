
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] points = new int[3][2];

        System.out.println("Enter 3 points (x y):");

        for (int i = 0; i < points.length; i++) {
            System.out.print("Point " + (i + 1) + ": ");
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        System.out.println("Result: " + isBoomerang(points));

        sc.close();
    }

    public static boolean isBoomerang(int[][] points) {
        long x1 = points[0][0], y1 = points[0][1];
        long x2 = points[1][0], y2 = points[1][1];
        long x3 = points[2][0], y3 = points[2][1];

        long cross = (x2 - x1) * (y3 - y1)
                   - (y2 - y1) * (x3 - x1);

        return cross != 0;
    }
}
