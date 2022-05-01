import java.util.*;

public class SumOfThree {


    public static void main(String[] args)
    {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {2, 3, 6, 1, 2};
        int a3[] = {3, 2, 4, 5, 6};
        int sum = 9;
        int n1 = a1.length;
        int n2 = a2.length;
        int n3 = a3.length;
        if (findTriplet(a1, a2, a3, n1, n2, n3, sum))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    static boolean findTriplet(int a1[], int a2[], int a3[],
    int n1, int n2, int n3,
    int sum)
{

    
       HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n1; i++)
     {
s.add(a1[i]);
}

     ArrayList<Integer> al = new ArrayList<>(s);
   for (int i = 0; i < n2; i++)
     {
        for (int j = 0; j < n3; j++)
         {

          if (al.contains(sum - a2[i] - a3[j]) & al.indexOf(sum - a2[i] - a3[j])!= al.get(al.size() - 1))
        {
          return true;
        }
         }
    }
         return false;
}
    
}
