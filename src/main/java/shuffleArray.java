import java.util.Arrays;
import java.util.Random;

public class shuffleArray {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        Random random = new Random();

        for (int i=0; i<a.length; i++)
        {
            int randomlength = random.nextInt(a.length);
            int temp = a[randomlength];
            a[randomlength] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));

    }
}
