import java.io.*;
import java.util.*;

class MultipleOccurence {
    public static void main(String args[]) {
        int arr[] = { 4, 6, 9, 2, 3, 4, 9, 6, 10, 4 };
        int n = arr.length;
        groupElements(arr, n);
    }

    static void groupElements(int arr[], int n) {
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.print(arr[i] + " ");
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[j] + " ");
                        visited[j] = true;
                    }
                }
            }
        }

    }
}