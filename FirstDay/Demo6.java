import java.util.Collection;
import java.util.LinkedHashSet;

public class Demo6{
    public static void main(String[] args) {
 Collection <Integer> rollNumbers = new LinkedHashSet<Integer>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        System.out.println(rollNumbers);
       
    }
}


// LinkedHashSet is nothing but a Linked List following the HashSet properties 

// -> Based on the requirement it does not store the duplicate rollNumbers and insertion order is maintained due to the linked list property.