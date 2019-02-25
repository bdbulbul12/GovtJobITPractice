
package ExtendVsRunnable1;

public class Test{
    public static void main(String[] args) throws InterruptedException{
        A obj = new A();
        obj.start(); //new Thread 
        
        for (int i = 0; i < 10; i++) {
            System.out.println(2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }

}

class A extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }
    
    public void print(){
        
    }
}