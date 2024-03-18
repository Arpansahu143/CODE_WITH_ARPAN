 class Complex {
    int real;
    int img;

    void setData(int real, int im) {
        this.real = real;
        this.img = im;
    }

    void display() {
        System.out.println(real + " + " + img+ "i");
    }

    public Complex add(Complex z1, Complex z2) {
        Complex sum = new Complex();
        sum.real = z1.real + z2.real;
        sum.img = z1.img + z2.img;
        return sum;
    }
}


public class Q02 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setData(3, 5);

        Complex c2 = new Complex();
        c2.setData(6, 2);

        System.out.print("First number: ");
        c1.display();
        System.out.print("Second number: ");
        c2.display();

        Complex sum = c1.add(c1, c2);
        System.out.print("Sum : ");
        sum.display();
    }
}