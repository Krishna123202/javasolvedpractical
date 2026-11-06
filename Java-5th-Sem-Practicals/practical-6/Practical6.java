public class Practical6 {
 static class Book {
 String title;
 String author;
 double price;
 Book() {
 title = "Untitled";
 author = "Unknown";
 price = 0.0;
 }
 Book(String title, String author, double price) {
 this.title = title;
 this.author = author;
 this.price = price;
 }
 Book(Book other) {
 this.title = other.title;
 this.author = other.author;
 this.price = other.price;
 }
 void display() {
 System.out.println(title + " | " + author + " | Rs. " + price);
 }
 }
 public static void main(String[] args) {
 Book b1 = new Book();
 Book b2 = new Book("Java Basics", "R. Kumar", 450);
 Book b3 = new Book(b2);
 System.out.println("Default object:");
 b1.display();
 System.out.println("Original object:");
 b2.display();
 System.out.println("Copied object:");
 b3.display();
 b3.price = 500;
 System.out.println("After changing copied object's price:");
 System.out.print("Original: ");
 b2.display();
 System.out.print("Copy: ");
 b3.display();
 }
}
