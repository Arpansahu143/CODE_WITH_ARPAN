import java.util.Scanner;
class HA5
{
public static String reverse(String S, int index)
{
if(index<S.length())
return reverse(S, index+1)+S.charAt(index);
else
return "";
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String S = sc.nextLine();
System.out.println("reverse is: "+reverse(S,0));
}
}