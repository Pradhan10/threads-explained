/* This example not only illustrates creation of thread using Runnable interface 
* but also introduces concept of anonymous object instantiation . 
*/


public class HelloRunnable implements Runnable {

    public void run() {
    
    	Thread  child = Thread.currentThread();
    	child.setName("Child");
        System.out.println("Hello from a thread!"+" "+child);
    }

    public static void main(String args[]) {
    
    	Thread main = Thread.currentThread();
    	System.out.println("Hello from main"+" "+main);
        (new Thread(new HelloRunnable())).start();
    }

}
