import java.util.*;

interface DetailInfo {
    void count();
    void display();
}

class Person implements DetailInfo {
    String name;
    int count;

    public Person(String name) {
        this.name = name;
        this.count = name.length();
    }

    public void count() {
        
    }

    public void display() {
        System.out.println("Your name: " + this.name);
        System.out.println("Number of character present: " + this.count);
    }
}

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        Person p = new Person(name);
        p.display();
    }
}