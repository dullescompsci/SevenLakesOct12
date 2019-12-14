import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Enchantment {
    static int a, b;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("enchantment.in"));
        a = sc.nextInt(); b = sc.nextInt(); sc.nextLine();
        int c = 0;
        while (c < 26) {
            if ((a * c) % 26 != 1) c++;
            else break;
        }
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != ' ') {
                    int newCh = c * (ch - 65 - b) % 26;
                    if (newCh < 0) newCh += 26;
                    char newChar = (char) (newCh + 65);
                    result += newChar;
                }
                else result += " ";

            }
            System.out.println(result);
        }






    }
}
