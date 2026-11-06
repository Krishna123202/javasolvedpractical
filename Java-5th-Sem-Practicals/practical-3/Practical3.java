public class Practical3 {
 interface Printable {
 void print();
 }
 interface Scannable {
 void scan();
 }
 static class AllInOnePrinter implements Printable, Scannable {
 public void print() {
 System.out.println("Printing document");
 }
 public void scan() {
 System.out.println("Scanning document");
 }
 }
 // Hybrid example: class inheritance + interfaces
 static class Machine {
 void switchOn() {
 System.out.println("Machine switched on");
 }
 }
 static class SmartPrinter extends Machine implements Printable, Scannable {
 public void print() {
 System.out.println("Smart printer prints");
 }
 public void scan() {
 System.out.println("Smart printer scans");
 }
 }
 public static void main(String[] args) {
 AllInOnePrinter printer = new AllInOnePrinter();
 printer.print();
 printer.scan();
 SmartPrinter smart = new SmartPrinter();
 smart.switchOn();
 smart.print();
 smart.scan();
 }
}