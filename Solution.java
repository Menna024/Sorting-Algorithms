import java.util.Scanner;

public class Solution {
    public static void bubbleSort(int[] arr,int n) { //At every path, a large element is placed at its correct position
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.print("The ordered array by bubble sort is :");
        display(arr);
    }

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
        System.out.print("The ordered array by selection sort is :");
        display(arr);
    }

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

        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                // Bubble Sort
                System.out.print("The unordered array is : ");
                display(arr);
                bubbleSort(arr,n);
                break;
            case 2:
                // Selection Sort
                System.out.print("The unordered array is : ");
                display(arr);
                selectionSort(arr,n);
                break;
            case 3:
                // Insertion Sort
                break;
            case 4:
                // Merge Sort
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
