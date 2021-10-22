import java.io.*;
import java.io.*;

public class Duck {
    public static void main(String args[]) throws IOException {
        String num = "1023";
        if (check_duck(num))
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }

    static boolean check_duck(String num) {
        int i = 0, n = num.length();
        while (i < n && num.charAt(i) == '0')
            i++;

        while (i < n) {
            if (num.charAt(i) == '0')
                return true;
            i++;
        }

        return false;

    }
}
