package org.example.Dec.Dec22;

//Given a string s , The task is to remove all the consecutive duplicate characters of the string and return the resultant string.
//
//        Examples:
//
//Input: s = "aaaaabbbbbb"
//Output: ab
//Explanation: Remove consecutive duplicate characters from a string s  such as 5 a's are at consecative so only write a and same like that in b's condition.
//
//Input: s = "geeksforgeeks"
//Output: geksforgeks
//Explanation: Remove consecutive duplicate characters from a string s such as ee are their hence remove one e.
//
//        Input: s = "aabccba"
//Output: abcba
//Explanation: In this 2 a's are at consecutive so 1 a's remove after that 2 c's are consecutive so one c remove .

public class removeDuplicateString {
        public static String removeDuplicates(String s) {
            int n = s.length();
            StringBuilder str = new StringBuilder();

            if (n == 0)
                return str.toString();

            // Traversing string
            for (int i = 0; i < n - 1; i++) {

                // checking if s.charAt(i) is not same
                //  as s.charAt(i+1) then add it into str
                if (s.charAt(i) != s.charAt(i + 1)) {
                    str.append(s.charAt(i));
                }
            }

            // Since the last character will not be inserted in the
            // loop we add it at the end
            str.append(s.charAt(n - 1));
            return str.toString();
        }

        public static void main(String[] args) {
            String s1 = "geeksforgeeks";
            System.out.println(removeDuplicates(s1));

            String s2 = "aabcca";
            System.out.println(removeDuplicates(s2));
        }
    }

