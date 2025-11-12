package org.example.Nov.Nov11;

public class Multiplication_Table {

    public static void main(String[] args) {
        int [] op = new int[100];
        int n= 2;
        for (int i = 1; i <= 10; i++) {
            op[i-1] = i*n;
            System.out.println(op[i-1]);
        }

    }
}
