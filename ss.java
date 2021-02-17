class LinkedList
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node( final int d)
        {
            data =d;
            next =null;
        }
    }