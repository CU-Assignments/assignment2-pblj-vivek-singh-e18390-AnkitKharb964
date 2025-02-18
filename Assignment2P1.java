class Product {
    // Attributes
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Product object
        Product product = new Product(001, "Play Station", 75000);

        // Displaying product details
        product.displayProduct();
    }
}
