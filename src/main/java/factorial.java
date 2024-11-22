public class factorial {
    public static int factorialrec (int count)
    {
        if (count ==0 || count ==1)
        {
            return 1;
        }
        else
        {
            return (count*factorialrec(count-1));
        }

    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(factorialrec(n));
    }
}
