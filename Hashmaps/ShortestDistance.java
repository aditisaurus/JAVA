import java.io.*;
import java.util.*;

public class ShortestDistance {
    public static void main(String args[]) {
        int a[] = { 3, 5, 8, 6, 7 };
        int K = 11;
        int n = a.length;
        System.out.println(find_maximum(a, n, K));
    }

    static void makePermutation(int[] a, int n) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (count.containsKey(a[i])) {
                count.put(a[i], count.get(a[i]) + 1);
            } else {
                count.put(a[i], 1);
            }
        }
    }

    static int find_maximum(int a[], int n, int k) {

        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int x = a[i];

            int d = Math.min(1 + i, n - i);
            if (!b.containsKey(x))
                b.put(x, d);

            else {

                b.put(x, Math.min(d, b.get(x)));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = a[i];

            if (x != k - x && b.containsKey(k - x))
                ans = Math.min(Math.max(b.get(x), b.get(k - x)), ans);
        }
        return ans;
    }

}
