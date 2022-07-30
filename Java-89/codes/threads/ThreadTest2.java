package co.edureka.threads;

class MyTask2 extends Thread{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName()+" is working inside run() method");
	}	
}


public class ThreadTest2 {

	public static void main(String[] args) {
		int n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("inside main method");
		
		MyTask2 task = new MyTask2();		
		task.start(); //runnable thread
		
		n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
	}

}

