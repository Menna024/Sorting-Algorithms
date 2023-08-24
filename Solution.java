import java.util.Scanner;

public class Solution {

    public static void display(int [] arr)
    {
        for(int s:arr)
        {
            if(s!=arr[arr.length-1])
             System.out.print(s+", ");
            else
             System.out.print(s);
        }
        
                System.out.println("");
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        int i=0;
        while(i<n) { 
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Select the desired sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quicksort");
        System.out.println("6. Counting sort" );
        int choice = sc.nextInt();

        System.out.print("The unordered array is : ");
        display(arr);
       
        switch(choice)
        {
            case 1:
                // Bubble Sort
                BubbleSort.bubbleSort(arr,n);
                display(arr);
                break;

            case 2:
                // Selection Sort
                SelectionSort.selectionSort(arr,n);
                display(arr);
                break;

            case 3:
                // Insertion Sort
                InsertionSort.insertionSort(arr,n);
                display(arr);
                break;

            case 4:
                // Merge Sort
                MergeSort.mergeSort(arr,n);
                display(arr);
                break;
            case 5:
                // Quicksort
                QuickSort.quickSort(arr,n,0,n-1);
                display(arr);
                break;   
            case 6:
                // Counting Sort
                CountingSort.countingSort(arr,n);
                display(arr);
                break;     
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
