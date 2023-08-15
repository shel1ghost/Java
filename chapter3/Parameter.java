public class Parameter{
    private String name;
    public Parameter(String n){
        name = n;
    }
    public void PrintName(){
        System.out.println(name);
    }
    public static void Greet(String func_name){
        System.out.println("Good Morning "+func_name);
    }
    public static void Greet(Parameter g){
        g.name = "Babi";
    }
}
