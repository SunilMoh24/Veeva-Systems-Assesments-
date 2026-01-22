import java.util.Collection;
import java.util.HashSet;
public class Demo3{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
Collection<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}
