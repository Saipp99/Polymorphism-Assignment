class shape
{
void draw()
{
System.out.println("Drawing a shape");
}
}
class circle extends shape
{
@override
void draw()
{
System.out.println("Drawing a Circle");
}
}
class square extends shape
{
@override
void draw()
{
System.out.println("Drawing a square");
}
}
class pra5
{
public static void main(String [ ] args)
{
circle c=new circle();
square  s=new square();
c.draw();
s.draw();
}
}