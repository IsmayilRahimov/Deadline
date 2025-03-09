package deadlineee;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(2, "fruit", 50);
        System.out.println("Meyve - qiymeti " + product.price + " Meyvenin Id-si " + product.id);
        System.out.println("Meyvenin adi " + product.name);

    }
}
