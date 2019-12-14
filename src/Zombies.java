import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zombies {
    public static boolean checkChar(char c) {
        String check = "";
        check += c;
        if ("ZOMBIE".contains(check) || "zombie".contains(check)) return false;
        return true;
    }
    public static String removeZombie(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (checkChar(str.charAt(i))) result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("zombies.in"));
        while (sc.hasNextLine()) System.out.println(removeZombie(sc.nextLine()));

    }
}
