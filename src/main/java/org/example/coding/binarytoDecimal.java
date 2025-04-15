package org.example.coding;


//Given a string b representing a Binary Number, The problem is to find its decimal equivalent.
//
//        Examples:
//
//Input : b = 111
//Output : 7
//Explanation : The decimal equivalent of the binary number 111 is 22 + 21 + 20 = 7.
//Input : b = 1010
//Output : 10
//Explanation : The decimal equivalent of the binary number 1010 is 23 + 21 = 10.
//Input: b = 100001
//Output: 33
//Explanation : The decimal equivalent of the binary number 100001 is 25 + 20 = 33.
//Constraints:
//        1 <= number of bits in binary number  <= 16


public class binarytoDecimal {
    public static void main(String[] args) {
        String b ="10111";
        // Code here
        int result=0, power =0;
        for (int i=b.length()-1; i>=0; i--)
        {
            if (b.charAt(i) == '1')
            {
                result += Math.pow(2, power);
            }
            power += 1;
        }
        System.out.println(result);
    }
}
