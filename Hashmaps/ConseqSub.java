import java.util.*;

public class ConseqSub {
    
    public static void main(String[] args)
{
    int A[] = { 2, 5, 3, 7, 4, 8, 5, 13, 6 };
    int n = A.length;
    findLIS(A, n);
}
 
static void findLIS(int A[], int n)
{
    Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
 
    int LIS_size = 1;
    int LIS_index = 0;
 
    hash.put(A[0], 1);

    for (int i = 1; i < n; i++)
    {
        hash.put(A[i], hash.get(A[i] - 1)==null? 1:hash.get(A[i] - 1)+1);
        if (LIS_size < hash.get(A[i]))
        {
            LIS_size = hash.get(A[i]);
            LIS_index = A[i];
        }
    }
 
    System.out.println("LIS_size = " + LIS_size);
 
    System.out.print("LIS : ");
    int start = LIS_index - LIS_size + 1;
    while (start <= LIS_index)
    {
        System.out.print(start + " ");
        start++;
    }
}

}
