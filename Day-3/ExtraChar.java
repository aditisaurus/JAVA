import java.io.*;
import java.util.*;

public class ExtraChar {
    public static void main(String args[]) {
        String strA = "abcd";
        String strB = "cbdad";

        System.out.println(findExtraCharcter(strA.toCharArray(), strB.toCharArray()));
    }

}
