package LinkListQuestion;
import java.util.Scanner;

public class Solution {

    // Node represents one element of the linked list
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    // Inserting a node in between 10 20 30 40
    static Node insert(Node head, int value, int position)
    {
        if(position<1)
        {
            System.out.println("Invalid position");
            return head;
        }
        if(head==null)
        {
            return head;
        }
        Node newnode=new Node(value);
        if(position==1)
        {
            newnode.next=head;
            head=newnode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null && position>2)
        {
            temp=temp.next;
            position--;
        }
        if(temp.next==null)
        {
            temp.next=newnode;
            return head;
        }
        newnode.next=temp.next;
        temp.next=newnode;
            return head;
    }
    // deleting a node from the linked list
    static Node deletenode(int value, Node head)
    {
        if(head==null)
        {
            return head;
        }
        if(head.val==value)
        {
            head=head.next;
            return head;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.val!=value)
        {
            temp=temp.next;
        }
        if(temp.next!=null)
        {
            temp.next=temp.next.next;
        }
        return head;
    }
    static Node addnode(Node p,Node head)
    {
        if(head ==null)
        {
            head=p;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=p;
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node head =null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n=sc.nextInt();
        for(int i =0; i <n;i++)
        {
            Node newNode = new Node(sc.nextInt());
            head=addnode(newNode,head);
        }
        System.out.println("Enter a node to delete");
        int value=sc.nextInt();
        head=deletenode(value,head);
        sc.close();
    }
}