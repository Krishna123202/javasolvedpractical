public class Practical1 {
    static class Student {
        int rollNo;
        String name;
        int mark1, mark2, mark3;

        Student(int rollNo, String name, int mark1, int mark2, int mark3) {
            this.rollNo = rollNo;
            this.name = name;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        int totalMarks() {
            return mark1 + mark2 + mark3;
        }

        double percentage() {
            return totalMarks() / 3.0;
        }

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Total: " + totalMarks() + "/300");
            System.out.printf("Percentage: %.2f%%%n", percentage());
            System.out.println("----------------");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 80, 75, 90);
        Student s2 = new Student(2, "Riya", 88, 92, 85);
        Student s3 = new Student(3, "Kabir", 70, 78, 82);
        s1.display();
        s2.display();
        s3.display();
    }
}