package io.fp;

public class Util {
    

    public static  double accumulateArea(Shape[] shapes)
    {
        double allArea=0;

        for(Shape shape: shapes)
        {
            if(shape!=null)
            {
                allArea+=shape.area();
            }
        }

        return allArea;
    }

    public static double accumulateCircumference(Shape[] shapes)
    {
        double allCircum=0;
        for(Shape shape:shapes)
        {
            if(shape!=null)
            {
                allCircum=shape.circumreference();
            }
        }
        return allCircum;
    }

    public static double accumulateCircumference(Object[] objects) {
        double allArea=0.0;

        for(Object obj: objects)
        {
            if(obj!=null)
            {
                if (obj instanceof Rectangle) {
					allArea+=((Rectangle)obj).circumreference();
				}
				if (obj instanceof Circle) {
					allArea+=((Circle)obj).circumreference();
				} 

            }
        }
        return allArea;
        }
}
