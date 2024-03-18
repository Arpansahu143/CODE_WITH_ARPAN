/*(Question-2) A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first 
few numbers are 1, 5, 12, 22, . . . . 
Write a method with the following header that returns a pentagonal number:*/



package ASSIGNMENT6;
import java.util.*;
public class Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            System.out.print( getPentagonalNumber(i)+"\t");
          if(i%10==0){System.out.println();}
        }
    }
    
  
    public static long getPentagonalNumber(int n) {
    
     
        return (long) n * (3 * n - 1) / 2;
    }
}

/*output-
 * The 5th pentagonal number is: 35
 */