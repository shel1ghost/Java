public class ThirdClass extends FirstClass implements SecondInterface{
    public ThirdClass(String n){
        super(n);
    }
    public void Greet2(){
        System.out.println("Good Morning "+name);
        System.out.println("Good Morning Stranger!");
    }
}
