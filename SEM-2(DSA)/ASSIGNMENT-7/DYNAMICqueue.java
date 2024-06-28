// Implementation of Queue using linked list(Dynamic Data Structure)
import java.util.*;
class Node
{
int data;
Node next;
}
public class DYNAMICqueue
{
public static Node rear = null;
public static Node front = null;
public static void insert()
{
Scanner sc = new Scanner(System.in);
Node p = new Node();
System.out.println("Enter the data of new node: ");
p.data = sc.nextInt();
p.next = null;;
if(rear == null)
{
rear = p;
front = p;
}
else
{
rear.next = p;
rear = p;
}
}
public static void delete()
{
if(front==null)
{
System.out.println("Queue underflow, delete not possible");
}
else
{
Node p = front;
front = front.next;
System.out.println("Deleted node info-- data value: "+p.data);
if(front == null)
{
rear = null;
}
}
}
public static void display()
{
if(front==null)
{
System.out.println("Empty Queue");
}
else
{
Node p = front;
System.out.println("Node details: \t value");
while(p!=null)
{
System.out.println(" \t\t "+p.data);
p = p.next;
}
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Program for creating stack using linked list");
while(true)
{
System.out.println("Menu for different operation");
System.out.println("Press 0: Exit");
System.out.println("Press 1: Insert");
System.out.println("Press 2: Delete");
System.out.println("Press 3: Display");
System.out.println("Enter your choice: ");
int choice = sc.nextInt();
switch(choice)
{
case 0: System.exit(0);
case 1: insert(); break;
case 2: delete(); break;
case 3: display(); break;
default: System.out.println("Wrong choice, try again");
}
}
}
}
