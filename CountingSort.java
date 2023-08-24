public class CountingSort {
    public static void countingSort(int[] arr,int n)
    {
        int max=arr[0];
        int[] output = new int[n + 1];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
             max=arr[i];
        }

        int[] count=new int[max+1];

        for(int i=0;i<max;i++) //initialize count array with 0
         count[i]=0;

        for(int i=0;i<n;i++) //store the count of each element
        { 
            count[arr[i]]++;
        } 

        for(int i=1;i<=max;i++) //store the cumulative count of each array
        {
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--) //place the elements in sorted order
        {
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }   

        for(int i=0;i<n;i++)
        {
            arr[i]=output[i];   
        }
    }
}
