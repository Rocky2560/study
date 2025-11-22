package org.example.Nov.Nov22;

public class Container {

    public static void main(String[] args) {
        int [] in = {1,2,5,8,9,15};
        System.out.println(maxArea(in));
    }

    private static int maxArea(int[] in) {

        int i =0;

        int j = in.length -1;

        int maxArea = 0;

        while (i < j)
        {
            int width = j-i;
            int minHeight = Math.min(in[i], in[j]);
            int currentArea = width * minHeight;

            maxArea = Math.max(maxArea, currentArea);

            if (in[i] < in[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
