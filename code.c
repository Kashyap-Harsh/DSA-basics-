/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scr=new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
        int n=0;
        try
        {
            n=scr.nextInt();
        } catch (Exception e) {}
        int arr[]=new int[n];
        try 
        {
            for(int i=0;i<n;i++)
                arr[i]=scr.nextInt();
        } catch (Exception e) {}
        Queue<Integer> Q  = new LinkedList<>();
        Queue<Integer> dispQ  = new LinkedList<>();
        Stack<Integer> S = new Stack<Integer>(); 
        Stack<Integer> dispS = new Stack<Integer>(); 

        for(int i=0;i<n;i++)
        {
            int x= arr[i];
            if((Q.isEmpty() && S.empty() ) || i==0)
            {
                Q.add(x);
            }
            else if(x>=)
        }
	}
}
