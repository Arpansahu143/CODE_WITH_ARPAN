package PROJECT;

public class Problem2_ConvertToAnyBase {

    public static void main(String[] args) {
        int a = 35;
        int b = 16;

        String result = convertToAnyBase(a, b);

        System.out.println("Decimal: " + a);
        System.out.println("Base: " + b);
        System.out.println("Converted value: " + result);
    }

    public static String convertToAnyBase(int i, int b) {
        if (i == 0) {
            return "0"; 
        }

        StringBuilder result = new StringBuilder();
        boolean isNegative = i < 0;
        i = Math.abs(i);

        while (i > 0) {
            int c = i % b;
            char digit = (char) (c < 10 ? c + '0' : c - 10 + 'A');
            result.insert(0, digit);
            i/= b;
        }

        if (isNegative) {
            result.insert(0, '-');
        }

        return result.toString();
    }
}
/*here i take a=Decimal number
b= base
c=remainder*/