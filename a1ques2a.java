/* 3. 2. Write a program to implement the following operations on a Sparse Matrix, assuming
the matrix is represented using a triplet.
(a) Transpose of a matrix.
 */
import java.util.*;
import java.io.*;
class a1ques2a
{
    static Scanner scr = new Scanner(System.in);
    static int a[];
    static int row[];
    static int column[];
    public static void main(final String[] args) {
        System.out.println("Enter number of rows ");
        int r = scr.nextInt();
        System.out.println("Enter number of columns ");
        int c = scr.nextInt();
        System.out.println("Enter number of non zero elemnts ");
        int n = scr.nextInt();
        
        a = new int[n];
        row = new int[n];
        column = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of " + i+" th non-zero element ");
            a[i]= scr.nextInt();
            System.out.println("Enter the row for this value ");
            row[i]= scr.nextInt();
            System.out.println("Enter the column for this value ");
            column[i]= scr.nextInt();
            System.out.println();
        }
        int p=0,q=0;
        System.out.println("\nSparse matrix ");
        for(int i = 0; i < r; i++){     
            for(int j = 0; j < c; j++){    
                if (i==row[p] && j==column[q])
                {
                    System.out.print(a[p]+"  ");
                    p++;
                    q++;
                }
                else
                    System.out.print("0  ");
            }    
            System.out.println();    
        }
        
        p=0;
        q=0;
        System.out.println("\nSparse Transpose matrix ");
        for(int i = 0; i < r; i++){      
            for(int j = 0; j < c; j++){    
                if (j==row[p] && i==column[q]){
                    System.out.print(a[p]+"  ");
                    p++;
                    q++;
                }
                else
                    System.out.print("0  ");

            }    
            System.out.println();  
        }    
    }  
}  
    
