import java.util.Scanner;
class HA6
{
public static String reverse(String S, int index)
{
if(index<S.length())
return reverse(S, index+1)+S.charAt(index);
else
return "";
}
public static void isPalindrome(String S)
{
if(S.equals(reverse(S,0)))
System.out.println("Palindrome string");
else
System.out.println("Not Palindrome string");
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String S = sc.nextLine();
isPalindrome(S);
}
}