/* This example  illustrates creation of thread by extending Thread class. 
* Author : Pradhan Rishi Sharma
* Email : pradhanrishi10@gmail.com
*/

public class HelloThread extends Thread {

    public void run() {
        
        Thread  child = Thread.currentThread();
    	  child.setName("Child");
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        
     	  Thread main = Thread.currentThread();
    	  System.out.println("Hello from main"+" "+main);
        (new HelloThread()).start();
    }

}
