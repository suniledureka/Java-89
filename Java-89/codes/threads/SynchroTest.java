package co.edureka.threads;
class Printer{
	//public void printTable(int num) {
	synchronized public void printTable(int num) {
		System.out.println(Thread.currentThread().getName()+" - is going to print the table for " + num);
		
		for(int i=1; i<=10;i++) {
			int p = num * i;
			System.out.println(num + " x " + i + " = " + p);			
		}
		System.out.println("------------------------------------------\n");
	}
}

class MyThread1 extends Thread{
	Printer printer;
	MyThread1(Printer p){
		printer = p;
	}
	public void run() {
		printer.printTable(5);
	}
}

class MyThread2 extends Thread{
	Printer printer;
	MyThread2(Printer p){
		printer = p;
	}
	public void run() {
		printer.printTable(6);
	}
}


public class SynchroTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		MyThread1 t1 = new MyThread1(printer);
		MyThread2 t2 = new MyThread2(printer);
		
		t1.start();
		t2.start();
	}
}
