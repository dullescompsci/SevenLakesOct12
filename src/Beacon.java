import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Beacon {
    public static long[] result;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("beacon.in"));
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            long prev, current, squares = 0;
            prev = 6; current = 6;
            for (int i = 2; i <= n; i++) {
                long side = 2 * i - 1;
                current = prev + side * side * 2 + 4 * side - (side - 2) * (side - 2) - 1;
                prev = current;
                squares += side * side;
            }

            //blocks;
            System.out.println("Ingots Needed: " + squares * 9);
            System.out.println("Faces: " + current);

        }
    }
}
