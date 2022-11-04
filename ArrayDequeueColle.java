package basics;
import java.util.*;
public class ArrayDequeueColle {

	public static void main(String[] args) {
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		
		deque.add("AA");  
		deque.add("BB");  
		deque.add("AA");  
		
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str); 
		}
		System.out.println("End of Array Dequeue Collections");
	}
}
