class Pen {  // pen class
    String colour;
    String company;
    String type;    // ballpoint, gel pen

    public void Write() {
        System.out.println("Writing Something");
    }

    public void printColour(){
        System.out.println(this.colour);
    }
}

class Student{ // student class
    int roll_no;
    String name;
    int age;

    Student() {
        System.out.println("parametric Student constructor is called");
    }
    Student(Student s2){
        System.out.println("copy constructor is called");   // when we call the constructor this runs
        this.name= s2.name;
        this.age= s2.age;
        this.roll_no= s2.roll_no;
    }

    public void printInfo(){
        System.out.println("student's name is "+this.name);
        System.out.println("student's PRN is "+this.roll_no);
        System.out.println("student's age is "+this.age);
    }
}

public class Main {   //main class
    public static void main(String[] args) {
        Pen pen1 = new Pen();  //default constructor
        System.out.println("default constructor is called"); 
        pen1.colour = "black";  // new object pen 1
        pen1.type = "Ball point";
        pen1.company = "Natraj";

        pen1.Write();

        Pen pen2 = new Pen();  //default constructor
        pen2.colour = "blue"; // new object pen 2
        pen2.type = "gel";
        pen2.company = "Rorito";

        pen1.printColour();
        pen2.printColour(); 

        Student student1 = new Student();  //parametric constructor
        student1.name = "Shubhankar";
        student1.roll_no = 187;
        student1.age = 19;

        student1.printInfo();

        Student s2 = new Student(student1);  //copied the student 1
        s2.printInfo();
    }
}