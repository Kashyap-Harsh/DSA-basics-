//Selection Sort
import java.util.*;
class a6ques1 
{ 
	static void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
		{ 
			int min = i; 
            for (int j = i+1; j < n; j++) 
            {
				if (arr[j] < arr[min]) 
                    min = j; 
            }
			int temp = arr[min]; 
			arr[min] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int n=scr.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Element : ");
            arr[i]=scr.nextInt();
        }
        printArray(arr);
		System.out.println("Sorted array"); 
        sort(arr);
        printArray(arr);
	} 
} 
