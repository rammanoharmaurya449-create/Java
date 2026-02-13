import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(String name) {
        Product toRemove = null;

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                toRemove = product;
                break;
            }
        }

        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println(name + " removed from cart.");
        } else {
            System.out.println(name + " not found in cart.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("\nShopping Cart:");
            for (Product product : products) {
                product.displayProduct();
            }
            System.out.println("Total Cost: $" + calculateTotal());
        }
    }
}

public class soppingCenter {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 750.00);
        Product p2 = new Product("Headphones", 50.00);
        Product p3 = new Product("Mouse", 25.00);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        System.out.println("\nRemoving Headphones...");
        cart.removeProduct("Headphones");

        cart.displayCart();
    }
}
