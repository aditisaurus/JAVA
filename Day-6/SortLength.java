import java.io.*;
import java.util.*;

public class SortLength {
    public static void main(String args[]) {
        String[] arr = { "GeeksforGeeks", "I", "from", "am" };
        int n = arr.length;

        sort(arr, n);

        printArraystring(arr, n);

    }

    static void sort(String s[], int n) {
        for (int i = 0; i < n; i++) {
            String temp = s[i];

            int j = i - 1;

            while (j >= 0 && temp.length() < s[j].length()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = temp;
        }
    }

    static void printArraystring(String str[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }
}
