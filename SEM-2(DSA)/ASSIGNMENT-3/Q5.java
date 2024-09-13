public class Q5
{
public static <T>void printArray(T[] arr)
{
for(int i = 0; i<arr.length;i++)
System.out.print(arr[i]+" ");
}
public static void main(String[] args)
{
// TODO Auto-generated method stub
Integer[] a = {10,20,30,40,50};
System.out.println("Integer array elements are: ");
printArray(a);
String[] b = {"IGT","DSA","UPM","Calculus"};
System.out.println("\nString array elements are: ");
printArray(b);
}
}