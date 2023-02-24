package io.fp;

public class RectangleCircle implements Shape {
    private Circle c;
    private Rectangle r;

    public RectangleCircle(double radius, double length, double width)
    {
        c = new Circle(radius);
        r = new Rectangle(length, width);

    }

    @Override
    public double area() {
        return (r.area()-c.area());
    }

    @Override
    public double circumreference() {
       
        return ((r.circumreference())+(c.circumreference()));
    }

    
}
