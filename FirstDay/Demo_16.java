import java.util.*;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product{name='" + name + "', quantity=" + quantity + "}";
    }
}

public class Demo_16{
    public static void main(String[] args) {

        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(101, new Product("Laptop", 5));
        productMap.put(102, new Product("Mouse", 20));
        productMap.put(103, new Product("Keyboard", 10));

        System.out.println("Products: " + productMap);
        int searchId = 102;
        if (productMap.containsKey(searchId)) {
            System.out.println("Product found: " + productMap.get(searchId));
        }
    }
}

