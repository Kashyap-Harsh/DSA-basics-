//Remove all even parity nodes from a Doubly and Circular Singly Linked List
import java.util.*;
class Parity
{
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            next=null;
            data=d;
        }
    };
    static int i;
    static Node last;
    static Scanner scr= new Scanner(System.in);
    static Node insert(Node last,int d)
    {
        Node fresh= new Node(d);
        fresh.next=last.next;
        last.next=fresh;
        last=fresh;
        return last;
    }

    static void input()
    {
        i=1;
        System.out.println("Keep on inserting the values, enter 0 to end");
        while(true)
        {
            System.out.print("Value : ");
            int d=scr.nextInt();
            if(d==0)
            {
                System.out.println("Breaking the process.");
                break;
            }
            if (i++==1)
            {
                last= new Node(d);
                last.next=last;
            }
            else
                last=insert(last, d);
        }
    }

    static void print(Node last)
    {
        Node curr=last.next;
        if (curr==null)
        {
            System.out.print("No element found. ");
            return;
        }
        System.out.print("-> ");
        do
        {
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }while(curr!=last.next);
    }

    static boolean getParity(int n) 
	{ 
		boolean parity = false; 
		while(n != 0) 
		{ 
			parity = !parity; 
			n = n & (n-1); 
		} 
		return !parity; 
		
	} 
    public static void main(String[] args) 
    {
        input();
        print(last); //head
        Node curr=last.next;
        Node prev=last;
        for(int j=1;j<i-1;j++)
        {
            if(getParity(curr.data))
            {
                prev.next=curr.next;
                curr=curr.next;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }

        } 
        System.out.println("\nLinkedList with even parity is : ");
        print(last);
        System.out.println();
    }

}