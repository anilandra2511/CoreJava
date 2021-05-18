import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        System.out.println("Enter the Array Elements");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++)
	 {
            	   arr[i] = scanner.nextInt();
        	 }
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        getSort(arr);
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }

    static void getSort(int[] arr) 
  {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) 
         {
            for (int j = 1; j < (n - i); j++)
	 {
                		if (arr[j - 1] > arr[j]) 
		{
                   	 temp = arr[j - 1];
                   	 arr[j - 1] = arr[j];
                   	 arr[j] = temp;
                		}
            	}
        }
    }
}