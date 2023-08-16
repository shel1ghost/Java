class OddThread extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            if(i%2==1){
                System.out.println("Odd number: "+i);
            }
        }
    }
}

class EvenThread extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            if(i%2==0){
                System.out.println("Even number: "+i);
            }
        }
    }
}

public class OddEven{
    public static void main(String[]args){
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
