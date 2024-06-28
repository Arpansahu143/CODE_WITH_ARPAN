import java.util.Scanner;

public class Arrayindex_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding largest and smallest element and their occurrence

        int max = arr[0], min = arr[0];
        int countMax = 1, countMin = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
                countMax = 1;
            } else if (arr[i] == max){
                countMax++;
            }
            if (arr[i] < min){
                min = arr[i];
                countMin = 1;
            } else if (arr[i] == min){
                countMin++;
            }
        }

        // Finding position of first occurrence of max and last occurrence of min

        int firstOccurMax , lastOccurMin ;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max ) {
                firstOccurMax = i ;
                break;
            }
            if (arr[i] == min) {
                lastOccurMin = i ;
                break;
            }
        }

        // Printing result

        System.out.println("Maximum element of Array is " + max + "  and occurs " + countMax + " times.");
        System.out.println("Minimum element of Array is " + min + "  and occurs " + countMin + " times.");
        System.out.println("First occurrence of maximum element is at position " + firstOccurMax + ".");
        System.out.println("Last occurrence of minimum element is at position " + lastOccurMin + ".");

        sc.close();
    }
}