import java.io.*;
import java.util.*;

public class Product {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 9, 40 };
        int x = 400;
        int n = arr.length;

        if (isProduct(arr, n, x))
            System.out.println("Yes");
        else
            System.out.println("No");

        x = 190;

        if (isProduct(arr, n, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean isProduct(int arr[], int n, int x) {
        HashSet<Integer> hset = new HashSet<>();
        if (n < 2)
            return false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (x == 0)
                    return true;
                else
                    continue;
            }

            if (x % arr[i] == 0) {
                if (hset.contains(x / arr[i]))
                    return true;

                hset.add(arr[i]);
            }
        }
        return false;
    }
}
