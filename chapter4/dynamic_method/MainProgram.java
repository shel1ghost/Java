public class MainProgram
{
public static void main(String[]args)
{
Square s1 = new Square(3);
Cube c1 = new Cube(5);
Square s = s1;
System.out.println(s.area());
s = c1;
System.out.println(s.area());
}
}
