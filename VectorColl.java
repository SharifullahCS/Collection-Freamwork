package basics;
import java.util.*;
public class VectorColl {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		
		v.add("Sharifullah");  
		v.add("Gol M...");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next()); 
		}
		System.out.println("End Of Victor Collection......");
	}
}
