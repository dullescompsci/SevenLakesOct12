import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Creeper {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("creeper.in"));
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if (index >= 7) break;
                if (str.charAt(i) == "creeper".charAt(index)) index++;
            }
            if (index == 7)  System.out.println("Aw Man");
            else System.out.println("I Still Rule The World");
        }

    }
}
