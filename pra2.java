class calculator
{
    double area(double radius)
    {
        return Math.PI*radius*radius;
    }
     double area(double length,double width)
    {
        return length*width;
    }
    double  area(double base,double height,boolean isTriangle)
    {
        return 0.5*base*height;
    }
}
public class pra2
{
    public static void main(String [] args)
    {
        calculator obj=new calculator();
        System.out.println("Area of circle:"+obj.area(4));
        System.out.println("Area of rectangle:"+obj.area(10,4));
        System.out.println("Area of triangle:"+obj.area(6,3,true));
        
    }
}

output:-
Area of circle:50.26548245743669
Area of rectangle:40.0
Area of triangle:9.0

