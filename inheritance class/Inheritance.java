class Shape{
    public void area(){
        System.out.println("Display area");
    }

}

class Triangle extends Shape{  //inheritance where Triangle is child class of shape class
    public void area (int length,int height){
        System.out.println(1.0/2 * length * height); 
    }
}
//multi level inheritance
class EquilatralTriangle extends Triangle{  //inheritance where Triangle is child class of shape class
    public void area (int length,int height){
        System.out.println(1.0/2 * length * height); 
    }
}
// hierarchyal inheritance
class Circle extends Shape{
    public void area(int radius){
        System.out.println(3.14*radius*radius);
    } 
}

public class Inheritance{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(3);
        
        EquilatralTriangle t1 = new EquilatralTriangle();
        t1.area(10, 5);
    }
}