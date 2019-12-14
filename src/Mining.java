import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Mining {
    static int rows, cols;
    static long torches;
    static char[][] cave;
    static long[][] flood;
    static int rowS, rowE, colS, colE;
    public static void floodfill(int i, int j, int dist) {

        flood[i][j] = dist;
        if (i == rowE && j == colE) return;
        if (j > 0 && cave[i][j-1] != '#') {
            if (flood[i][j-1] != -1 && flood[i][j-1] <= dist) {
            }
            else floodfill(i, j-1, dist + 1);
        }
        if (j < cols - 1 && cave[i][j+1] != '#') {
            if (flood[i][j+1] != -1 && flood[i][j+1] <= dist) {
            }
            else floodfill(i, j+1, dist + 1);
        }
        if (i > 0 && cave[i-1][j] != '#') {
            if (flood[i-1][j] != -1 && flood[i-1][j] <= dist) {
            }
            else floodfill(i-1, j, dist + 1);
        }
        if (i < rows - 1 && cave[i+1][j] != '#') {
            if (flood[i+1][j] != -1 && flood[i+1][j] <= dist) {
            }
            else floodfill(i+1, j, dist + 1);
        }

    }
    public static void floodfill(char[][] cave) {
        rowS = 0; colS = 0; rowE = 0; colE = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (cave[i][j] == 'S') {
                    rowS = i;
                    colS = j;
                }
                if (cave[i][j] == 'E') {
                    rowS = i;
                    colS = j;
                }
            }
        }

        flood = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flood[i][j] = -1;
            }
        }
        floodfill(rowS, colS, 1);
        if (torches * 6 >= flood[rowE][colE]) System.out.println("Take Back The Night!");
        else System.out.println("Don't Mine At Night!");

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("mining.in"));
        int cases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cases; i++) {
            rows = sc.nextInt(); cols = sc.nextInt();
            torches = sc.nextLong();
            cave = new char[rows][cols];
            for (int j = 0; j < rows; j++) {
                String str = sc.nextLine();
                for (int k = 0; k < str.length(); k++) {
                    cave[j][k] = str.charAt(k);
                }
            }
            floodfill(cave);
        }


    }
}
