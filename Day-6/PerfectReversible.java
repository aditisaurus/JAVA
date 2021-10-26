import java.io.*;
import java.util.*;

public class PerfectReversible {
    public static void main(String args[]) {
        String str = "aba";
        if (isReversible(str))
            System.out.print("YES");
        else
            System.out.print("NO");
    }

    static boolean isReversible(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
