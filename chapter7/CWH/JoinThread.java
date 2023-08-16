class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<=20){
            System.out.println("This is first thread...");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<=20){
            System.out.println("This is second thread...");
            i++;
        }
    }
}

public class JoinThread{
    public static void main(String[]args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}

