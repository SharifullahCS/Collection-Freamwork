package basics;
import java.util.*;
public class TreeSetColl {

	public static void main(String[] args) {
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		
		set.add("Sharf");  
		set.add("Vijay");  
		set.add("Sharf");  
		set.add("Ajay");  
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		System.out.println("////////////TreeSet 3 Interface Collection...........");
	}
}