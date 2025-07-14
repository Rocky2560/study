package org.example.interview;

public class reverseString {
    public static void main(String[] args) {
        String s = "sudip";
//        StringBuilder stringBuilder = new StringBuilder(s);
////        stringBuilder.reverse();
//        for (int i=s.length()-1 ; i >= 0; i--)
//        {
//            stringBuilder.append(s.charAt(i));
//        }
//        System.out.println(stringBuilder);

        char[] op = s.toCharArray();
        int left =0, right = s.length()-1;
        while (left < right)
        {
            char temp = op[left];
            op[left] = op[right];
            op[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(op));

    }
}
