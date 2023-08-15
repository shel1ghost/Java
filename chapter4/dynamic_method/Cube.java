public class Cube extends Square
{
public Cube(int s)
{
super(s);
}
public int area()
{
return super.area() * side;
}
}
