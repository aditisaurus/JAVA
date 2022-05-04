import java.io.*;
import java.util.*;

public class ZeroSum {

     public static void main(String args[])
     {
        int[] arr
        = new int[] { 15, -2, 2, -8, 1, 7, 10, 23 };
    System.out.println(max(arr));
     }

     public static int max(int arr[])
     {
         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
         hm.put(0,0);
         int length = -1;
         int cumsum = 0;

         for(int i = 0; i < arr.length; i++)
         {
             cumsum = cumsum + arr[i];

             if(hm.containsKey(cumsum)) {
                 length = Math.max(length, i + 1 - hm.get(cumsum));
             }
             else {
                 hm.put(cumsum, i+1);
             }
         }
         return length;
     }

    
}
