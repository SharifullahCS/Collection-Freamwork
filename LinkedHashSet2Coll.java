package basics;
import java.util.*;
public class LinkedHashSet2Coll {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		
		set.add("Sharf");  
		set.add("Khalil");  
		set.add("Sharf");  
		set.add("Ahmad");  
		
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		System.out.println("LinkedHashSet 2 Interface Collection");
	}
}