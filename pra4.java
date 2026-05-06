class Animal
{
void sound( )
{
System.out.println("Anima makes sound..!");
}
}
class Dog extends Animal
{
@Override
void sound( )
{
System.out.println("Dog barks");
}
}
public class pra4
{
public static void main(String[ ] args)
{
Animal d=new Dog();
d.sound();
}
}