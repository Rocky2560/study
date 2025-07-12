package org.example.interview;
import java.util.*;
public class duplicate_remove {

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        HashSet<Integer> op = new HashSet<Integer>();
        for (int x: arr)
        {
            op.add(x);
        }
        int [] a = new int[op.size()];
        int i=0;
        for (int y: op)
        {
            a[i++]=y;
        }
        System.out.println("Arrays after removing duplicates"+Arrays.toString(a));
    }
}
