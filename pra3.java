class printData
{
    void print(int x)
    {
        
        System.out.println("Integer");
        
    }
    void print( String s)
    {
        System.out.println("String");
    }
    void print( double d)
    {
        System.out.println("double");
    }
}
public class pra3
{
    public static void main(String [ ] args)
    {
         printData p=new printData();
         p.print(5.3);
         p.print(5);
         p.print("Hello");
         p.print(null);
    }
}

output:-
double
Integer
String
String