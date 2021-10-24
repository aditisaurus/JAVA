import java.io.*;
import java.util.*;

public class SamePosition {
    public static void main(String args[]) {
        String str = "AbgdeF";
        System.out.print(findCount(str));
    }

    static int findCount(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i == (str.charAt(i) - 'a') || i == (str.charAt(i) - 'A')) {
                result++;
            }

        }
        return result;
    }

}
