public class SecondClass extends FirstClass{
    public SecondClass(String n){
        super(n);
    }
    public void Greet2(){
        super.Greet(); //accessing methods with super keyword
        System.out.println("Have a nice day "+name);
    }
}
