import java.util.HashSet;
import java.util.Set;
public class Demo_15{
    public static void main(String[] args) {

        Set<String> usernames = new HashSet<String>();
        usernames.add("Mohan");
        usernames.add("Sunil");
        usernames.add("Hari");
        usernames.add("Mohan");  

        if (usernames.contains("sam")) {
            System.out.println("Username exists");
        }

        System.out.println(usernames);
    }
}

