/*(q4)-Write a java program that displays the number of days in year from 2000 to 2020.*/



package ASSIGNMENT6;
public class Q4 {

    public static void main(String[] args) {
        System.out.println("Year\tNumber of Days");
        System.out.println("--------------------");

        
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "\t" + numberOfDaysInAYear(year));
        }
    }

    
    public static int numberOfDaysInAYear(int year) {
       
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
    }
}
/* output-
 * Year    Number of Days
--------------------
2000    366
2001    365
2002    365
2003    365
2004    366
2005    365
2006    365
2007    365
2008    366
2009    365
2010    365
2011    365
2012    366
2013    365
2014    365
2015    365
2016    366
2017    365
2018    365
2019    365
2020    366
*/