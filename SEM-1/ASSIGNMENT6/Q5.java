/*(Q5)-A regular polygon is an n-sided polygon in which all sides are of the same length and all angles 
have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for 
computing the area of a regular polygon is
Area = 𝑛 × 𝑆
2
4 ×tan(
𝜋
𝑛
)
Write a method that returns the area of a regular polygon using the following header: */



package ASSIGNMENT6;

public class Q5 {

    public static void main(String[] args) {
       
        int nos = 5;
        double sideLength = 4.5;

        double pa = area(nos, sideLength);
        System.out.println("rea of the regular polygon: " + pa);
    }

   
    public static double area(int n, double side) {
       
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
//nos=number of slides
//pa=polygon area
/*OUTPUT-
 * rea of the regular polygon: 34.83966736192658
 */