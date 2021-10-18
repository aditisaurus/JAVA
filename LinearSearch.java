import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

class GFG {
    public static void main(String args[]) {
        int arr[] = { 20, 30, 40, 10, 50, 60 };
        int x = 10;

        // Function Call
        int result = search(arr, x);
        if (result == -1)
            System.out.print("Result not found");
        else
            System.out.print("The number is at index" + result);
    }

    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
