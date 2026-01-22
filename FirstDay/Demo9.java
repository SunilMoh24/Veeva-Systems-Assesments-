import java.util.ArrayList;
import java.util.List;
public class Demo9 {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<Integer>();
        scores.add(0);
        scores.add(4);
        scores.add(1);
        scores.add(6);
        scores.add(1);
        System.out.println("Ball to Ball Score");
        for (int i = 0; i < scores.size(); i++) {
            System.out.print(scores.get(i) + " ");
        }
    }
}

// I used ArrayList because , it can store the duplicate elements (Set Interface classes cannot store Duplicate)

// Since the order matters , we can get the elements in the ArrayList through the indexes , so we achieve the order functionality

