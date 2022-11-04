package basics;
import java.util.*;
public class LinkedListColl {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		
		al.add("Sharifullah");  
		al.add("Irfanullah");  
		al.add("Arya");  
		al.add("Ahmad");  
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		System.out.println("The End........");
	}
}