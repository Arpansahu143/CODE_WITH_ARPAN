/*(q8)-Write a java method to check a string is palindrome or not.
*/



package ASSIGNMENT6;

public class Q8 {

    public static void main(String[] args) {
        String inputString = "oyo";
        
        
        if (isPalindrome( inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
    
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

/*OUTPUT-
"level" is a palindrome.
 */