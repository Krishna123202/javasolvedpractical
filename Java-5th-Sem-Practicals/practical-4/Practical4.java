public class Practical4 {
 static class Calculator {
 int add(int a, int b) { return a + b; }
 int add(int a, int b, int c) { return a + b + c; }
 double add(double a, double b) { return a + b; }
 }
 static class Employee {
 double calculatePay() { return 0; }
 }
 static class PermanentEmployee extends Employee {
 @Override
 double calculatePay() { return 30000 + 5000; }
 }
 static class ContractEmployee extends Employee {
 @Override
 double calculatePay() { return 20 * 8 * 200; }
 }
 public static void main(String[] args) {
 Calculator c = new Calculator();
 System.out.println(c.add(10, 20));
 System.out.println(c.add(10, 20, 30));
 System.out.println(c.add(2.5, 3.5));
 Employee e;
 e = new PermanentEmployee();
 System.out.println("Permanent pay: " + e.calculatePay());
 e = new ContractEmployee();
 System.out.println("Contract pay: " + e.calculatePay());
 }
}