import java.io.*;
import java.util.*;

public class ReverseEquation {
    public static void main(String args[]) {
        String s = "a+b*c-d/e";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        String result = "", str = "";
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '*') {
                result = s.charAt(i) + str + result;
                str = "";

            }

            else {
                str += s.charAt(i);

            }

        }
        result = str + result;
        return result;
    }
}
