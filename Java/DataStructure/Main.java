package DataStructure_searching;


public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Keyboard", "Accessories"),
                new Product(105, "Monitor", "Electronics")

        };

        System.out.println("Linear Search");

        Product p1 = LinearSearch.search(products, 104);

        System.out.println(p1);

        System.out.println();

        System.out.println("Binary Search");

        Product p2 = BinarySearch.search(products, 104);

        System.out.println(p2);

    }

}