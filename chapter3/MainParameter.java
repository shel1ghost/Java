public class MainParameter{
    public static void main(String[]args){
        Parameter n1 = new Parameter("Anup");
        n1.Greet("Astra");
        Parameter.Greet(n1);
        n1.PrintName();
    }
}
