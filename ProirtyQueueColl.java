package basics;
import java.util.*;
public class ProirtyQueueColl {

	public static void main(String[] args) {
		//1_Queue<String> q1 = new PriorityQueue();  
		//2_Queue<String> q2 = new ArrayDeque();
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		
		queue.add("Sharifullah42 Amin");  
		queue.add("Gul Mohammad");  
		queue.add("JaiShankar");  
		queue.add("Gulo");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		
		System.out.println("iterating the queue elements.............");  
		Iterator itr=queue.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		queue.remove();  
		queue.poll();  
		
		System.out.println("after removing two elements...........");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}
		System.out.println(".......The End OF Priority Queue Collection........");  

	}
}
