/* This example not only illustrates creation of thread using Runnable interface 
* but also introduces concept of anonymous object instantiation . 
* Author : Pradhan Rishi Sharma
* Email : pradhanrishi10@gmail.com
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
