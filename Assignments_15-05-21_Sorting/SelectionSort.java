public class Selectionsort
 {
    public static void selectionSort(int[] testArr)
     {
	for (int i = 0; i < testArr.length; i++)
	{
		int index = i;
		for (int j = i + 1; j < testArr.length; j++)
		{
			if (testArr[j] < testArr[index])
			{
				index = j;
			}
		}
		int smallerNumber = testArr[index];
		testArr[index] = testArr[i];
		testArr[i] = smallerNumber;
	}
     }

   public static void main(String a[])
    {
	int[] arr1 = {15,50,20,0,3};
	System.out.println("Before Selection Sort");
	for(int i:arr1)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	selectionSort(arr1);//sorting array using selection sort
	System.out.println("After Selection Sort");
	for(int i : arr1)
	{
		System.out.print(i+" ");
	}
     }
}