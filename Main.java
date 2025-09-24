class Pen {
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

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "black";
        pen1.type = "Ball point";
        pen1.company = "Natraj";

        pen1.Write();

        Pen pen2 = new Pen();
        pen2.colour = "blue";
        pen2.type = "gel";
        pen2.company = "Rorito";

        pen1.printColour();
        pen2.printColour();        
    }
}