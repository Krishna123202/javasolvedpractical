public class Practical5 {
 static class ComplexNumber {
 double real;
 double imaginary;
 ComplexNumber(double real, double imaginary) {
 this.real = real;
 this.imaginary = imaginary;
 }
 ComplexNumber add(ComplexNumber other) {
 return new ComplexNumber(
 this.real + other.real,
 this.imaginary + other.imaginary
 );
 }
 void display() {
 System.out.println(real + " + " + imaginary + "i");
 }
 }
 public static void main(String[] args) {
 ComplexNumber n1 = new ComplexNumber(4, 3);
 ComplexNumber n2 = new ComplexNumber(2, 5);
 ComplexNumber result = n1.add(n2);
 System.out.print("First: ");
 n1.display();
 System.out.print("Second: ");
 n2.display();
 System.out.print("Sum: ");
 result.display();
 }
}
