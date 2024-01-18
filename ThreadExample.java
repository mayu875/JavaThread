public class ThreadExample extends Thread{

	   private Thread t;
	   private String threadName;
	   
	   ThreadExample( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	 class TestThread {

	   public static void main(String args[]) {
	      ThreadExample T1 = new ThreadExample( "Thread-1");
	      T1.start();
	      
	      ThreadExample T2 = new ThreadExample( "Thread-2");
	      T2.start();
	}   
}
...........................................................................................................................................
public class ThreadExample1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadExample1 thread = new ThreadExample1();
		thread.start();
		System.out.println("This code is outside thread");
	}

	public void run() {
		System.out.println("This code is running thread");

	}
}
..............................................................................................................................................
public class ThreadExample2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadExample2 te = new ThreadExample2();
		Thread thread = new Thread(te);
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("This code is running of the thread");

	}
}