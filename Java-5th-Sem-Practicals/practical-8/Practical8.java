public class Practical8 {
 static class Product {
 String productName;
 double price;
 int quantity;
 Product() {
 this("Unknown", 0.0, 0);
 }
 Product(String productName) {
 this(productName, 0.0, 0);
 }
 Product(String productName, double price) {
 this(productName, price, 0);
 }
 Product(String productName, double price, int quantity) {
 this.productName = productName;
 this.price = price;
 this.quantity = quantity;
 }
 double totalCost() {
 return price * quantity;
 }
 void display() {
 System.out.println(productName + " | price=" + price
 + " | quantity=" + quantity + " | total=" + totalCost());
 }
 }
 public static void main(String[] args) {
 Product p1 = new Product();
 Product p2 = new Product("Pen");
 Product p3 = new Product("Notebook", 50);
 Product p4 = new Product("Bag", 800, 2);
 p1.display();
 p2.display();
 p3.display();
 p4.display();
 }
}

