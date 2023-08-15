//Thread(String name)

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is running!");
    }
}

public class ThreadConstructor1{
    public static void main(String[]args){
        MyThr t1 = new MyThr("Satyaprem");
        //t1.setName("Satyaprem");
        t1.start();
        System.out.println(t1.getName());
    }
}
