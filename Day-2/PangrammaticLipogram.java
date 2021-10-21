import java.io.*;
import java.util.*;

public class PangrammaticLipogram {
    public static void main(String args[]) {
        char[] str = "The quick brown fox jumped over the lazy dog".toCharArray();
        panLipogramChecker(str);

        str = "The quick brown fox jumps over the lazy dog".toCharArray();
        panLipogramChecker(str);

        str = "The quick brown fox jum over the lazy dog".toCharArray();
        panLipogramChecker(str);
    }

    static String alphabets = "abcdefghijklmnopqrstuvwxyz";

    static void panLipogramChecker(char[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = Character.toLowerCase(s[i]);
        }
        int counter = 0;

        for (int i = 0; i < 26; i++) {
            int pos = find(s, alphabets.charAt(i));

            if (pos < 0 || pos > s.length)
                counter += 1;

        }
        if (counter == 0)
            System.out.println("Pangram");
        else if (counter >= 2)
            System.out.println("Not a pangram but might a lipogram");
        else
            System.out.println("Pangrammatic Lipogram");

    }

    static int find(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i])
                return 1;
        }
        return -1;
    }
}
