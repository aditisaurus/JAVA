import java.io.*;
import java.util.*;

public class IntegerCheck {

    public static void main(String args[]) {
        String str = "6790";

        if (isNumber(str))
            System.out.println("Integer");

        else
            System.out.println("String");
    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;

        return true;
    }
}
