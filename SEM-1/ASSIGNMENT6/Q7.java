/*(q7)-Write java method called count accepts a string as input and returns the number of vowels in 
it */



package ASSIGNMENT6;

public class Q7 {

    public static void main(String[] args) {
        String a = "engineering";
       
        System.out.println("Number of vowels in \"" + a + "\": " + count(a));
    }

    public static int count(String str) {
        int b = 0;
        
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

           
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                b++;
            }
        }

        return b;
    }
}
/*OUTPUT-
 Number of vowels in "engineering": 5
 */