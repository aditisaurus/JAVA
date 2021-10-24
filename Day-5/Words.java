import java.util.*;
import java.io.*;

public class Words {
    public static void main(String args[]) {
        String str = "One two       three\n four\tfive ";
        System.out.println("No of words : " + countWords(str));
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty())
            return 0;

        String[] w = str.split("\\s+");

        return w.length;

    }

}
