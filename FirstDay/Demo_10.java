import java.util.LinkedHashMap;
import java.util.Map;

public class Demo_10 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new LinkedHashMap<>();

        studentMap.put(101, "Mohan");
        studentMap.put(102, "Sunil");
        studentMap.put(103, "Hari");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



// Since it is mentioned to store in the insertion order , I used the LinkedHashmap.



