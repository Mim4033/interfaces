package se.jannatul.interfaces;


public class main {
    public static void main(String[] args) {


        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(8, 9);

        System.out.println("circle area: " +  circle.Area() );
        System.out.println("circle parameter: " +  rectangle.Perimeter() );
        System.out.println("rectangle area: " +  rectangle.Area() );
        System.out.println("rectangle parameter: " +  rectangle.Perimeter() );

    }
}