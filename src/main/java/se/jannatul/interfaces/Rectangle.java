package se.jannatul.interfaces;


public  class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public double Perimeter() {
        return 2 * (length + width);
    }
}
