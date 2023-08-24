public class SelectionSort {

     public static void selectionSort(int[] arr,int n) { //At every path, a small element is placed at its correct position
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                 min=j;
            }

            if(min!=i)
            {
                //swap arr[min] and arr[i]
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

}
