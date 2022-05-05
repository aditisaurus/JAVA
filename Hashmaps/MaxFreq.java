import java.util.*;
import java.io.*;

public class MaxFreq {

    public static void main(String args[])
    {
        int arr[] = { 3, 1, 3, 2, 3, 2 };
        int n = arr.length;
     
        System.out.println(maxdiff(arr, n));
    }

    static int maxdiff(int arr[], int n)
    {
        Map<Integer, Integer> freq = new HashMap<>();

        int ans = 0;

        for(int i=0; i<n; i++)
        {
            freq.put(arr[i]);
            freq.get(arr[i]) == null ? 1 :
        freq.get(arr[i]) + 1;
 
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if (freq.get(arr[i]) > freq.get(arr[j]) &&
                arr[i] > arr[j])
                ans = Math.max(ans, freq.get(arr[i]) -
                                    freq.get(arr[j]));
            else if (freq.get(arr[i]) < freq.get(arr[j]) &&
                    arr[i] < arr[j] )
                ans = Math.max(ans, freq.get(arr[j]) -
                                    freq.get(arr[i]));
            }
        }
        return ans;
    }
}
