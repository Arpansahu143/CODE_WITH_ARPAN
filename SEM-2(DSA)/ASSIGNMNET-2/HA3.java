// dm=deposit ammount
// i= random index
// tm=total ammount

import java.util.*;

class Bank {
    String bankName;
    int dm;
    static int tm;

    public Bank() {
        this.bankName = "";
        this.dm = 0;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAmount(int dm) {
        if (dm >= 1000) {
            this.dm = dm;
            tm += this.dm; // Accumulate total deposit amount
        } else {
            this.dm = 0;
            System.out.println("Balance not credited due to low balance");
        }
    }

    public void showData() {
        System.out.println(this.bankName + "\t" + this.dm);
    }

    public static int bankDetails(Bank[] b) {
        int minIndex = 0;
        for (int j = 1; j < b.length; j++) {
            if (b[j].dm < b[minIndex].dm) {
                minIndex = j;
            }
        }
        return minIndex;
    }
}

public class Ha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many accounts do you want to create: ");
        int n = sc.nextInt();
        Bank[] b = new Bank[n];

        for (int j = 0; j < n; j++) {
            sc.nextLine(); // Consume newline left by nextInt()
            System.out.println("Enter bank name and deposit amount (minimum 1000): ");
            String name = sc.nextLine();
            int amt = sc.nextInt();
            b[j] = new Bank();
            b[j].setBankName(name);
            b[j].setAmount(amt);
        }

        System.out.println("*******Book information*******");
        System.out.println("Bank name \t Amount ");
        for (int j = 0; j < n; j++) {
            b[j].showData();
        }

        System.out.println("Total amount deposited is " + Bank.tm);

        int minIndex = Bank.bankDetails(b);
        System.out.println("Bank details with minimum deposit amount:");
        b[minIndex].showData();

        sc.close(); // Close the scanner
    }
}

