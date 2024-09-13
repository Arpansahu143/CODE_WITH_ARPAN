import java.util.Scanner;
class Box1<T>
{
T item;
public void setValue(T item)
{
this.item = item;
}
public T returnValue()
{
return this.item;
}
}
public class Q4
{
public static void main(String[] args)
{
Box1<String> S = new Box1<String>();
S.setValue("CSE");
System.out.println(S.returnValue());
Box1<String> S1 = S;
Box1<String> S2 = S;
S1.setValue("CSIT");
System.out.println(S.returnValue());
System.out.println(S1.returnValue());
System.out.println(S2.returnValue());
Box1<Integer> I = new Box1<Integer>();
I.setValue(10);
System.out.println(I.returnValue());
Box1<Integer> I1 = I;
Box1<Integer> I2 = I;
I1.setValue(20);
System.out.println(I.returnValue());
System.out.println(I1.returnValue());
System.out.println(I2.returnValue());
Box1<Object> ob = new Box1<Object>();
// ob.setValue(“ITER”); - this is not comment , write it on your code
System.out.println(I.returnValue());
Box1<Object> ob1 = ob;
Box1<Object> ob2 = ob;
ob1.setValue(100);
System.out.println(ob.returnValue());
System.out.println(ob1.returnValue());
System.out.println(ob2.returnValue());
}
}