class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i<40){
            System.out.println(this.getName());
            i++;
        }
    }
}

public class Priorities{
    public static void main(String[]args){
        MyThread t1 = new MyThread("Astra");
        MyThread t2 = new MyThread("Shellghost");
        MyThread t3 = new MyThread("Satyaprem ki katha");
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
