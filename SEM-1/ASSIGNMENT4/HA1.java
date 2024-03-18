public class HA1 {
    public static void main(String[] args) {
        int s = 0, ss = 0;//s=sum of the square and ss=square of sum
        for (int i = 1; i <= 10; i++) {
            s += i * i;
            ss += i;
        }

        ss *= ss;
        int diff = ss - s;

        System.out.println("difference: "+diff); 
    }
}