import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NearestIsland {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("nearestisland.in"));
        double firstx = sc.nextDouble(), firsty = sc.nextDouble();
        double maxX = 0, maxY = 0;
        double min = Double.MAX_VALUE;
        String minStr = "";
        while (sc.hasNextLine()) {
            double x = sc.nextDouble(), y = sc.nextDouble();
            double dist = Math.pow(firstx-x, 2) + Math.pow(firsty-y, 2);
            if (dist < min) {
                min = dist;
                maxX = x;
                maxY = y;
            }
        }
        System.out.print("[");
        System.out.printf("%.1f", maxX);
        System.out.print(", ");
        System.out.printf("%.1f", maxY);
        System.out.print("]");
    }
}
