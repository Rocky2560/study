package org.example.search;

public class linearsearch {

    static void search(int [] a, int n, int x)
    {
        boolean check = false;
        for (int i = 0; i < n; i++) {

            if (a[i] == x) {
                check = true;
                break;
            }
        }
        if (check == true)
        {
            System.out.println("Found the number");
        }
        else
        {
            System.out.println("Missing the number");

        }

    }

    public static void main(String[] args) {
        int [] a = {2,1,5,4,3};
        int x = 50;
        int n = a.length;
        search(a, n, x);

    }
}
