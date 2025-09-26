class Student { // student class
    int roll_no;
    String name;
    int age;

    // default constructor
    Student() {
        this.name = "Shubhankar";
        this.age = 19;
        this.roll_no = 187;
    }

    // method overloading
    public void printInfo(String name) {
        System.out.println("student's name is " + name);
    }

    public void printInfo(int age) {
        System.out.println("student's age is " + age);
    }

    public void printInfo(double roll_no) {
        System.out.println("student's PRN is " + roll_no);
    }
}

public class Poly {   // compiletime polymorphism
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.printInfo(student1.name);     // calls printInfo(String)
        student1.printInfo(student1.age);      // calls printInfo(int)
        student1.printInfo(student1.roll_no);  // calls printInfo(double)
    }
}