import java.io.*;
import java.util.*;
public class AwwMan {
    public static void main(String[] args) throws IOException {
        String output = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 13; j++) output += "@";
            for (int j = 0; j < 11; j++) output += " ";
            for (int j = 0; j < 13; j++) output += "@";
            output += "\n";
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) output += " ";
            for (int j = 0; j < 13; j++) output += "@";
            for (int j = 0; j < 12; j++) output += " ";
            output += "\n";
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) output += " ";
            for (int j = 0; j < 27; j++) output += "@";
            for (int j = 0; j < 5; j++) output += " ";
            output += "\n";
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) output += " ";
            for (int j = 0; j < 8; j++) output += "@";
            for (int j = 0; j < 11; j++) output += " ";
            for (int j = 0; j < 8; j++) output += "@";
            for (int j = 0; j < 5; j++) output += " ";
            output += "\n";
        }
        System.out.println(output);
    }
}
