package co.edureka.threads;

class Naturals extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName().toUpperCase()+" - " + i);
		}
	}
}

class Evens extends Thread{
	public void run() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(Thread.currentThread().getName().toUpperCase()+" - " + i);
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		Naturals nat = new Naturals();
		Evens eve = new Evens();
		
		nat.setName("Natural");
		eve.setName("Even   ");
		
		nat.start();
		eve.start();
	}
}
