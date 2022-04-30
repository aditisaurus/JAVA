import java.util.HashMap;

public class SumByK {
    public static void main(String[] args)
    {
        int arr[] = { 92, 75, 65, 48, 45, 35 };
        int k = 10;
 
        // Function call
        boolean ans = canPairs(arr, k);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }

static boolean canPairs(int arr[], int k)
{
      if(arr.length%2 == 1)
      return false;

      HashMap<Integer,Integer> hm = new HashMap<>();

      for(int i=0; i<arr.length; i++)
      {
          int rem = ((arr[i]%k + k) %k);
          if(!hm.containsKey(rem)){
              hm.put(rem,0);
          }
          hm.put(rem, hm.get(rem+1));
      }

      for(int i=0; i < arr.length; i++)
      {
          int rem = ((arr[i]%k) + k) % k;

          if(2*rem == k){
              if(hm.get(rem) % 2 == 1)
              return false;
          }

          else if(rem == 0)
          {
              if(hm.get(rem) % 2 == 1)
              return false;
          }
          else {
            if (hm.get(k - rem) != hm.get(rem))
                return false;
        }
      }
      return true;
}
    
}
