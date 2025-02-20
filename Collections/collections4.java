package Collections;

import java.util.PriorityQueue;

public class collections4 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(10);
		p.add(20);
		p.add(30);
		
		System.out.println(p.peek());
		
		System.out.println(p.poll());
		
		System.out.println(p.peek());
	}

}
