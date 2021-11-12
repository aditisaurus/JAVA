import java.io.*;
import java.util.*;

public class OccurenceK {
    public static void main(String args[]) {
        int arr[] = { 1, 7, 4, 3, 4, 8, 7 };
        int n = arr.length;
        int k = 2;
        System.out.println(firstElement(arr, n, k));
    }

    static int firstElement(int arr[], int n, int k) {
        HashMap<Integer, Integer> count_map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = 0;
            if (count_map.get(arr[i]) != null) {
                a = count_map.get(arr[i]);
            }
            count_map.put(arr[i], a + 1);
        }

        for (int i = 0; i < n; i++) {
            if (count_map.get(arr[i]) == k) {
                return arr[i];
            }
        }

        return -1;

    }
}
