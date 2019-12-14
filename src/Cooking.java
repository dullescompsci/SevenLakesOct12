import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cooking {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("cooking.in"));
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int ascii = 0;
            for (int i = 0; i < str.length(); i++) {
                ascii += str.charAt(i);
            }
            int min = ascii/60;
            int sec = ascii%60;
            System.out.println(min + "min, " + sec + "sec");
        }
    }
}
