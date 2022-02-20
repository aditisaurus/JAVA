import java.io.*;
import java.util.*;

public class Disjoint {

    public static void main(String args[]) {
        Disjoint dis = new Disjoint();
        int set1[] = { 12, 34, 11, 9, 3 };
        int set2[] = { 7, 2, 1, 5 };

        boolean result = dis.aredisjoint(set1, set2);
        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    boolean aredisjoint(int set1[], int set2[]) {

        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if (set1[i] == set2[j])
                    return false;
            }
        }
        return true;
    }
}
