public class MainThread{
    public static void main(String[]args){
        Thread t = Thread.currentThread();
        System.out.println("Current thread = "+t);
        t.setName("Astra");
        t.setPriority(3);
        System.out.println("After changing the name: "+t);
        try{
            for(int n=5; n>0; n--){
                System.out.println(n);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
