class MyThread1 extends Thread{
    public void run(){
        int i=1;
        while(i<=20){
            System.out.println("Thread1 is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=1;
        while(i<=20){
            System.out.println("Thread2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class ExtendThread{
    public static void main(String[]args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
