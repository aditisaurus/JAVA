import java.io.*;
import java.util.*;
import java.util.PriorityQueue;

public class SubSeq {

    public static void main(String args[])
    {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println(
            "Length of the Longest consecutive subsequence is "
            + find(arr, n));
    }

    static int find(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0; i<n; i++)
        {
            pq.add(arr[i]);

        }

        int prev = pq.poll();

        int c = 1;
        int max = 1;

        for(int i=1; i<n; i++)
        {
            if(pq.peek() - prev > 1)
            {
                c = 1;
                 prev = pq.poll();

            }

            else if(pq.peek() - prev == 0)
            {
                prev = pq.poll();
            }

            else
            {
                c++;
                prev = pq.poll();
            }

            if(c > max)
            {
                max = c;
            }
        }
        return max;
    }
    
}
