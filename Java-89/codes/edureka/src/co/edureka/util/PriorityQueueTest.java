package co.edureka.util;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i = 10; i > 0; i--) {
			pq.add(i);
		}
		
		System.out.println(pq);
		System.out.println("----> " + pq.poll());
		System.out.println(pq);		
		
		System.out.println("----> " + pq.poll());
		System.out.println(pq);		
		
	}
}
