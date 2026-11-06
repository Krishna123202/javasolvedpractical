public class Practical9 {
 static class Employee {
 String name;
 double salary;
 static int count = 0;
 Employee() {
 this("Not Assigned", 0.0);
 }
 Employee(String name, double salary) {
 this.name = name;
 this.salary = salary;
 count++;
 }
 void display() {
 System.out.println(name + " earns Rs. " + salary);
 }
 static void displayCount() {
 System.out.println("Total employees created: " + count);
 }
 }
 public static void main(String[] args) {
 Employee e1 = new Employee();
 Employee e2 = new Employee("Asha", 30000);
 Employee e3 = new Employee("Rohan", 40000);
 e1.display();
 e2.display();
 e3.display();
 Employee.displayCount();
 }
}
