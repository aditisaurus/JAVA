import java.io.*;
import java.util.*;

public class SortChar {
    public static void main(String args[]) {
        String s = "geeksforgeeks";
        sortString(s);
    }

    static void sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
}
