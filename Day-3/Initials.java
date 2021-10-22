import java.io.*;
import java.util.*;

public class Initials {
    public static void main(String args[]) {
        String name = "prabhat kumar singh";
        printInitials(name);
    }

    static void printInitials(String name) {
        if (name.length() == 0)
            return;

        System.out.println(Character.toUpperCase(name.charAt(0)));

        for (int i = 0; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
    }
}
