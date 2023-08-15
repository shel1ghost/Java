class RunnableThread1 implements Runnable{
    public void run(){
        int i=1;
        while(i<=20){
            System.out.println("Runnable Thread 1");
            i++;
        }
    }
}

class RunnableThread2 implements Runnable{
    public void run(){
        int i=1;
        while(i<=20){
            System.out.println("Runnable Thread 2");
            i++;
        }
    }
}

public class RunnableThread{
    public static void main(String[]args){
        RunnableThread1 bullet1 = new RunnableThread1();
        Thread gun1 = new Thread(bullet1);
        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
