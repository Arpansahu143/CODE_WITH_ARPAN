class PointType
{
int xCoordinate,yCoordinate;
public PointType(int x, int y)
{
this.xCoordinate = x;
this.yCoordinate = y;
}
public double returnXcoordinate()
{
return this.xCoordinate;
}
public double returnYcoordinate()
{
return this.yCoordinate;
}
}
class CircleType extends PointType
{
double radius, area, perimeter ;
public CircleType(int x, int y, double r)
{
super(x,y);
this.radius = r;
}
public void operation()
{
this.area = Math.PI*Math.pow(this.radius, 2);
this.perimeter = 2*Math.PI*this.radius;
}
public void display()
{
System.out.println("Circle center x = "+returnXcoordinate()+", and y ="+returnYcoordinate());
System.out.println("Circle radius: "+this.radius);
System.out.println("Area: "+this.area);
System.out.println("Perimeter: "+this.perimeter);
}
}
public class HA5
{
public static void main(String[] args)
{
CircleType z = new CircleType(2, 6, 5.1);
z.operation();
z.display();
}
}