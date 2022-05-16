public class Selection2 {
    
    public static void main(String args[])
    {
        Selection2 ob = new Selection2();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.print("Sorted Array");
        ob.printArray(arr);
    }

    void sort(int arr[])
    {
        int n = arr.length;

        for(int i =0; i<n-1; n++)
        {
            int x = i;
            for(int j=i+1; j<n; j++)
                if(arr[j] < arr[x])
                x=j;
            
            int temp = arr[x];
            arr[x] = arr[i];
            arr[i] = temp;

        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
