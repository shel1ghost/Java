public class RunnableThread implements Runnable{
    public void run(){
        try{
        System.out.println("Thread is running...");
        Thread.sleep(1000);
        System.out.println("Thread is still running...");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[]args){
        RunnableThread r1 = new RunnableThread();
        Thread t1 = new Thread(r1); //using constructor Thread(Runnable r)
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}
