import java.util.*;

public class FreqDiff {

    public static void main(String[] args)
    {
 
        int arr[] = { 7, 8, 4, 5, 4, 1,
                      1, 7, 7, 2, 5 };
        int n = arr.length;
 
        System.out.println(findDiff(arr, n));
    }

    static int findDiff(int arr[], int n)
    {
        Arrays.sort(arr);
 
        int count = 0, max_count = 0,
            min_count = n;
 
        for (int i = 0; i < (n - 1); i++) {
 
            if (arr[i] == arr[i + 1]) {
                count += 1;
                continue;
            }
            else {
                max_count = Math.max(max_count,
                                     count);
 
                min_count = Math.min(min_count,
                                     count);
                count = 0;
            }
        }
 
        return (max_count - min_count);
    }
    
}
