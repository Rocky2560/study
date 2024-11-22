import java.util.ArrayList;
import java.util.List;

public class merge_list {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);

        List<List<Integer>> l3 = new ArrayList<List<Integer>>();
        l3.add(list1);
        l3.add(list2);
        System.out.println(l3);

    }
}
