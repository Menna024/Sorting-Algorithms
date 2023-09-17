import java.util.Arrays;

public class MergeSort {
    private static void merge(int[] arr,int[] leftHalf,int[] rightHalf)
    {
        // Merge two sorted arrays
        int i=0,j=0,k=0;

        while(i<leftHalf.length && j<rightHalf.length)
        {
            if(leftHalf[i] <= rightHalf[j])
            {
                arr[k]=leftHalf[i];
                i++;
            }
            else
            {
                arr[k]=rightHalf[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftHalf, if there are any
        while(i<leftHalf.length)
        {
            arr[k]=leftHalf[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightHalf, if there are any
        while(j<rightHalf.length)
        {
            arr[k]=rightHalf[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr,int n) {
        // At every path, the array is divided into two halves
        // At every path, the array is merged in sorted order

        // Base case
        if(n < 2) {
            return;
        }

        // Divide the array into two halves  
        int mid = n/2;
        int[] leftHalf = new int[mid]; 
        int[] rightHalf = new int[n-mid]; 

        for(int i=0;i<mid;i++) { 
            leftHalf[i] = arr[i];
        }

        for(int i=mid;i<n;i++) { 
            rightHalf[i-mid] = arr[i]; 
        }

        // Recursively call mergeSort on left and right halves
        mergeSort(leftHalf,mid);  
        System.out.println("Left half: " + Arrays.toString(leftHalf));

        mergeSort(rightHalf,n-mid);
        System.out.println("Right half: " + Arrays.toString(rightHalf));

        // Merge the two sorted halves
        merge(arr,leftHalf,rightHalf);
    }
}
