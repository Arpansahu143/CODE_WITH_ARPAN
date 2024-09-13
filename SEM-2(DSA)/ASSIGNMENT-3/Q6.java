public class Q6
{
public <T>int count(T[] arr, T item)
{
int c = 0;
for(int i = 0;i<arr.length;i++)
{
if(arr[i]==item)
c++;
}
return c;
}
public static void main(String[] args) {
Q5 o = new Q5();
Integer[] a = {10,20,30,40,50,20,10,20};
System.out.println("Occurrence of search elements: "+o.count(a,20));
String[] b = {"IGT","DSA","UPM","Calculus","DSA"};
System.out.println("\nString array elements are: " +o.count(b,"DSA"));
}
}