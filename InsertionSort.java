public class InsertionSort {
    public static void insertionSort(int[] arr,int n) { //At every path, a small element is placed
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;   
        }
    }

}
