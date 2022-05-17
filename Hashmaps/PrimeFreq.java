import java.util.*;
import java.util.HashMap;

public class PrimeFreq {
    public static void main(String[] args)
    {
        int[] arr = { 11, 11, 11, 23, 11, 37,
                      37, 51, 51, 51, 51, 51 };
        int k = 2;
 
        primeOccurences(arr, k);
    }

    static void primeOccurences(int[] arr, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            int val = arr[i];
            int freq;
            if(map.containsKey(val)){
                freq = map.get(val);
                freq++;
            }
            else freq=1;
            map.put(val,freq);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet())  {
            int value = entry.getValue();
            if(isPrime(value) && value >=k )
            System.out.println(entry.getKey());
        }
    }

    private static boolean isPrime(int n)
    {
        if ((n > 2 && n % 2 == 0) || n == 1)
            return false;       
 
        for (int i = 3; i <= (int)Math.sqrt(n);
             i += 2) {
            if (n % i == 0)
                return false;           
        }
        return true;
    }

}
