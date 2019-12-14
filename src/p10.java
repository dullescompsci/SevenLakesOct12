import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("import java.io.File;\n" +
                "import java.io.IOException;\n" +
                "import java.math.BigInteger;\n" +
                "import java.util.Scanner;\n" +
                "\n" +
                "public class Beacon {\n" +
                "    public static long[] result;\n" +
                "    public static void main(String[] args) throws IOException {\n" +
                "        Scanner sc = new Scanner(new File(\"beacon.in\"));\n" +
                "        while (sc.hasNextLine()) {\n" +
                "            int n = Integer.parseInt(sc.nextLine());\n" +
                "            BigInteger prev, current, squares = new BigInteger(new int[0]);\n" +
                "            current = new BigInteger(\"ONE\");\n" +
                "            prev = new BigInteger(\"SIX\"); current = new BigInteger(\"SIX\");\n" +
                "            for (int i = 2; i <= n; i++) {\n" +
                "                BigInteger side = new BigInteger(\"ONE\");\n" +
                "                side.multiply(new BigInteger(\"TWO\")); side.subtract(new BigInteger(\"ONE\"));\n" +
                "                current = prev.add(side.multiply(side.multiply(new BigInteger(\"TWO\"))));\n" +
                "                current = current.add(new BigInteger(\"FOUR\").multiply(side));\n" +
                "                current = current.add(new BigInteger(\"FOUR\").multiply(side.subtract(new BigInteger(\"TWO\")).multiply(side.subtract(new BigInteger(\"TWO\")))));\n" +
                "                prev = current;\n" +
                "                squares.add(side.multiply(side));\n" +
                "            }\n" +
                "\n" +
                "            //blocks;\n" +
                "            System.out.println(\"Ingots Needed: \" + squares.multiply(new BigInteger(\"NINE\")));\n" +
                "            System.out.println(\"Faces: \" + current);\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "}\np1.in"));
    }
}
