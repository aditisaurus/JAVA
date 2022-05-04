import java.util.*;
import java.io.*;

public class EvenSubset {

    public static void main(String args[])
    {
        int arr[] = {4, 2, 1, 9, 2, 6, 5, 3};
    int n = arr.length;
    System.out.println("Number of subsets = "
        + count(arr, n));
    }

    static int count (int arr[], int n)
    {
        HashSet<Integer> us = new HashSet<>();
    int even_count = 0;

    for (int i = 0; i < n; i++)
        if (arr[i] % 2 == 0)
            us.add(arr[i]);

            even_count=us.size();

            return (int) (Math.pow(2, even_count) - 1);
    }
    
}
