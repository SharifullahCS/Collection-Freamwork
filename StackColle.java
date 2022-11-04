package basics;
import java.util.*;
public class StackColle {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		
		stack.push("Ali");  
		stack.push("Baryal");  
		stack.push("Cotak");  
		stack.push("Didaar");  
		stack.push("Ehsan");  
		stack.pop(); 
		Iterator<String> itr=stack.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		System.out.println("End of (Stack Collection).....");
	}
}
