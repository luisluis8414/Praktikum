package io.fp;
import java.lang.Math;

public class Circle implements Shape{
    double radius;
    Shape[] shapes;

    public Circle (double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI)*(Math.pow(radius, 2));
        
    }

    @Override
    public double circumreference()
    {   
        return 2*(radius)*(Math.PI);
    }

   

    

    

    

    
}
