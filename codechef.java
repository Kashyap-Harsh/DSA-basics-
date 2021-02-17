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
        LinkedList<Integer> Q = new LinkedList<Integer>(); 
        LinkedList<Integer> S = new LinkedList<Integer>();

        for(int i=0;i<n;i++)
        {
            int x= arr[i];
            //1st
            if((Q.isEmpty() && S.isEmpty() ) || i==0)
                Q.add(x);
            //2 a
            else if(x>=Q.getLast())
                Q.add(x);
            //2 b
            else if (S.isEmpty() || x<=S.peekFirst())
                S.push(x);
            //2 c 
            else
            {
                //2 c i
                while(!S.isEmpty())
                {
                    int top = S.peekFirst();
                    //2 c i i
                    if(top<Q.getFirst())
                        Q.add(S.remove());
                    //2 c i ii
                    else
                        Q.add(Q.remove());
                }
                //2 c ii
                while(Q.getFirst()<x)
                    Q.add(Q.remove());
                //2 c iii
                S.push(Q.remove());
                //2 c iv
                S.push(x);
                //2 c v
                while(Q.getFirst()>Q.getLast())
                    Q.add(Q.remove());
            }
            int check=0;
            for(int num=0; num<Q.size(); num++,check++)
                System.out.print(Q.get(num)+" ");
            if(check!=0)
            {
                System.out.println();
                check=0;
            }
            for(int num=0; num<S.size(); num++,check++)
                System.out.print(S.get(num)+" ");
            if(check!=0)
            {
                System.out.println();
                check=0;
            }
        }
    }
}
