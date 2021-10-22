import java.io.*;
import java.util.*;

public class CharSame {

    public static void main(String args[]) {
        String s = "aaa";
        if (allCharSame(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean allCharSame(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++)
            if (s.charAt(i) != s.charAt(0))
                return false;

        return true;
    }
}
