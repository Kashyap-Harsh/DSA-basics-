//Insertion Sort
import java.util.*;
class a6ques2
{ 
	static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) 
        { 
            int key = arr[i]; 
            int j;
            for(j = i - 1; j >= 0 && arr[j] > key; j--) 
            { 
                arr[j + 1] = arr[j]; 
            } 
            arr[j + 1] = key; 
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
