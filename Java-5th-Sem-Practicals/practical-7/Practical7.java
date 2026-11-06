public class Practical7 {
 static class Demo {
 Demo() {
 System.out.println("Object constructed");
 }
 void use() {
 System.out.println("Object is being used");
 }
 }
 public static void main(String[] args) {
 Demo obj = new Demo();
 obj.use();
 obj = null; // no reference to the object remains here
 System.out.println("Reference removed; object may be eligible for GC.");
 System.gc(); // request only; not a guarantee
 System.out.println("GC request sent. Program continues.");
 }
}
