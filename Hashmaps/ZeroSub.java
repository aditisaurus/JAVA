import java.util.HashSet;
import java.util.*;
import java.io.*;
import java.uti.Set;

public ZeroSub {

    public static void main(String args[])
    {
        int arr[] = { -3, 2, 3, 1, 6 };
        if (subArrayExists(arr))
            System.out.println(
                "Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }
    
    static Boolean subArrayExists(int arr[])
    {
        HashSet<Integer> hs = new HashSet<Integer>();
 
        int sum = 0;
 
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
 
            if (arr[i] == 0
                || sum == 0
                || hs.contains(sum))
                return true;
 
            hs.add(sum);
        }
 
       
        return false;
    }
    
}
