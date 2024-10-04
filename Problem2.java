import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static <T> List<T> combineLists(List<T> list1, List<T> list2) {
        List<T> combined = new ArrayList<>();
        int i = 0, j = 0;


        while (i < list1.size() && j < list2.size()) {


            combined.add(list1.get(i++));
            combined.add(list2.get(j++));
        }
        while (i < list1.size()) {


            combined.add(list1.get(i++));
        }
        while (j < list2.size()) {


            combined.add(list2.get(j++));
        }
        return combined;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        List<Integer> combinedList = combineLists(list1, list2);


        System.out.println("Combined List: " + combinedList);
    }
}