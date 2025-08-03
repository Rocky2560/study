package org.example.interview;
import java.util.ArrayList;
import java.util.List;

public class odd_even {

    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>();
        in.add(2);
        in.add(5);
        in.add(6);
        in.add(9);
        in.stream().forEach(x -> {
            if ( x % 2 == 0)
            {
                System.out.println(x +" is even");
            }
            else
            {
                System.out.println(x + " is odd");
            }
    });
    }
}
