package co.edureka.threads;

class MyTask1 implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName()+" is working inside run() method");
	}	
}


public class ThreadTest1 {

	public static void main(String[] args) {
		int n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("inside main method");
		
		MyTask1 task = new MyTask1();
		Thread ct = new Thread(task);
		ct.start(); //runnable thread
		
		n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
	}

}
