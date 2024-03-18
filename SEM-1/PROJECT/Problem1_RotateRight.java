package PROJECT;
public class Problem1_RotateRight {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13};
        System.out.println("Original array:");
        printArray(array);
        System.out.println("After rotation array:");
        rotateRightBy2Bits(array);
        printArray(array);
    }

    public static void rotateRightBy2Bits(int[] a) {
        int last_2_Bits = a[3] & 3; 
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = (a[i] >>> 2) | ((a[i - 1] & 3) << 30); 
        }
        a[0] = (a[0] >>> 2) | (last_2_Bits << 30); 
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Integer.toBinaryString(a[i]));
        }
        System.out.println();
    }
}