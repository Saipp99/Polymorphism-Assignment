class calculator
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
}
public class pra1
{
public static void main(String [] args)
{
calculator c=new calculator();
System.out.println("Sum of two integers values :"+c.add(10,40));
System.out.println("Sum of three integers values:"+c.add(62,46,25));
System.out.println("Sum of two double values :"+c.add(23.6,15.2));

}
}

output:-
Sum of two integers :50
Sum of three integers :133
Sum of two double values :38.8
