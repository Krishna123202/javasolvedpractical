public class Practical2 {
 // Single inheritance
 static class Vehicle {
 void start() { System.out.println("Vehicle starts"); }
 }
 static class Car extends Vehicle {
 void drive() { System.out.println("Car is moving"); }
 }
 // Multilevel inheritance
 static class Person {
 void showPerson() { System.out.println("I am a person"); }
 }
 static class Employee extends Person {
 void work() { System.out.println("Employee is working"); }
 }
 static class Manager extends Employee {
 void manage() { System.out.println("Manager manages a team"); }
 }
 // Hierarchical inheritance
 static class Shape {
 void describe() { System.out.println("This is a shape"); }
 }
 static class Circle extends Shape {
 double area(double r) { return 3.14 * r * r; }
 }
 static class Rectangle extends Shape {
 double area(double l, double w) { return l * w; }
 }
 public static void main(String[] args) {
 Car car = new Car();
 car.start();
 car.drive();
 Manager manager = new Manager();
 manager.showPerson();
 manager.work();
 manager.manage();
 Circle c = new Circle();
 Rectangle r = new Rectangle();
 c.describe();
 System.out.println("Circle area: " + c.area(2));
 r.describe();
 System.out.println("Rectangle area: " + r.area(4, 5));
 }
}
