package org.example.Nov.Nov19;

//Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
//
//Examples:
//
//Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: [1, 2, 4, 3, 5, 0, 0, 0]
//Explanation: There are three 0s that are moved to the end.
//
//Input: arr[] = [10, 20, 30]
//Output: [10, 20, 30]
//Explanation: No change in array as there are no 0s.
//
//Input: arr[] = [0, 0]
//Output: [0, 0]
//Explanation: No change in array as there are all 0s.
public class ReverseStringWithSpace {

    public static void main(String[] args) {
        String s = "internship at geeks for geeks";
        reverses(s);
        System.out.println(preserveSpace(s));

    }

    private static String preserveSpace(String s) {
        int i=0, j=s.length()-1;
        char[] ch = s.toCharArray();

        while (i < j)
        {
            if(s.charAt(i) == ' '){ i++; continue;}
            else if (s.charAt(j) == ' '){ j--; continue;}
            else
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }

        }
        return String.valueOf(ch);

    }

    private static void reverses(String s) {
        char[] in = s.toCharArray();
        char[] op = new char[s.length()];

        for (int i = 0; i < in.length; i++) {
            if (in[i] == ' ') {
                op[i] = ' ';
            }
        }
        int j = op.length-1;
       for (int i = 0; i < in.length; i++) {
           if (in[i] != ' '){
               if (op[j] == ' ') {
                   j--;
               }
            op[j] = in[i]; j--;

        }}
        System.out.println(String.valueOf(op));
    }
}
