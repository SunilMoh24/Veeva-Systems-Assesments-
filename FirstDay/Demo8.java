import java.util.Set;
import java.util.TreeSet;
public class Demo8 {
        public static void main(String[] args) {
        Set<String> employee = new TreeSet<String>();
        employee.add("Mohan");
        employee.add("Sunil");
        employee.add("Hari");
        System.out.println("Employee Names in Sorted Order:");
        System.out.println(employee);
    }
}

// TreeSet stores the Element in the Sorted Order.

// I did not use Hash Set because hash set has the capability of not storing duplicate elements , but stores in the random order

// LinkedHashSet stores in the insertion order.
