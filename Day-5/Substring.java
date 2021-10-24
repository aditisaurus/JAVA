import java.io.*;
import java.util.*;

public class Substring {
    public static void main(String args[]) {
        String s = "abcde";
        System.out.println(countSubstr(s));
    }

    static int countSubstr(String s) {
        int n = s.length();
        return n * (n + 1) / 2;
    }
}
