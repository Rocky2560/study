package org.example.interview;

public class Bank {

    public int balance = 0;
    public static void main(String[] args) {
        Bank bank = new Bank();
        int n = 500;
        int x =400;
        bank.add(n);
        bank.withdrawl(x);
        bank.check();
    }

    private void withdrawl(int n) {
        if (balance<0 || balance<n)
        {
            System.out.println("the balnce can't be withdrawl");
        }
        else {
            balance -= n;
            System.out.println("The balance is "+ balance+ " after transaction");

        }
    }

    private void check() {
        System.out.println("the balance is "+ balance);
    }

    private void add(int n) {
        balance +=n;
        System.out.println("balance is " + balance);
    }
}
