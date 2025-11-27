package org.example.Nov.Nov27;
//Given a sentence s, determine whether it is a palindrome sentence or not. A palindrome sentence is a sequence of characters that reads the same forward and backward after:
//
//Converting all uppercase letters to lowercase.
//Removing all non-alphanumeric characters (i.e., ignore spaces, punctuation, and symbols).
//Examples:
//
//Input: s = "Too hot to hoot."
//Output: true
//Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "toohottohoot" which is a palindrome.
//
//Input: s = "Abc 012..##  10cbA"
//Output: true
//Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "abc01210cba" which is a palindrome.
//
//Input: s = "ABC $. def01ASDF.."
//Output: false
//Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "abcdef01asdf" which is not a palindrome.


public class palindromeSentence {
    public static void main(String[] args) {

        String s = "Too hot to hoots.";
        System.out.println(isPalinSent(s)
                ? "true" : "false");
    }

    private static boolean isPalinSent(String s) {
       int i=0, j=s.length()-1;
       while (i < j)
       {
           if (!Character.isLetterOrDigit(s.charAt(i))) i++;
           if (!Character.isLetterOrDigit(s.charAt(j))) j--;
           else if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
               i++;
               j--;
           }
           else return false;
       }
        return true;
    }
}
