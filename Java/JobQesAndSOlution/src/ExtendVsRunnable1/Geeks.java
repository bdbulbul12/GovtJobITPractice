
package ExtendVsRunnable1;


public class Geeks {
    
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.m();
        Thread t2 = new Thread(t1);
        t2.start();
       
    }
    
}

class myThread extends B implements Runnable{
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("1");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }

    @Override
    public void m() {
        System.out.println("This class From B Class");
    }

   
}

 class B{
    public  void  m(){
        System.out.println("Hello");
    }

}
   