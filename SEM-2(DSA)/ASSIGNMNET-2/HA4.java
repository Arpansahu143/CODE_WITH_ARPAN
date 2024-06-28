// here i take m= meteres and cm= centimetres
class Distance
{
double m, cm;
public Distance()
{
this.m = 0;
this.cm = 0;
}
public Distance(double m, double cm)
{
this.m = m;
this.cm = cm;
}
public Distance add(Distance d1, Distance d2)
{
Distance d3 = new Distance();
d3.m = d1.m + d2.m;
d3.cm = d1.cm + d2.cm;
if(d3.cm>=100)
{
d3.m+= (int)(d3.cm/100);
d3.cm = d3.cm%100;
}
return d3;
}
public void display()
{
System.out.println(this.m+" "+this.cm);
}
}
public class HA4
{
public static void main(String[] args)
{
Distance d1 = new Distance(5, 70);
Distance d2 = new Distance(15, 50);
Distance d3 = new Distance();
d3 = d3.add(d1,d2);
d1.display();
d2.display();
d3.display();
}
}
