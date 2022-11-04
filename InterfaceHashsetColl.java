package basics;
import java.util.*;
//Set<data-type> s1 = new HashSet<data-type>(); ...................
//Set<data-type> s2 = new LinkedHashSet<data-type>();  
//Set<data-type> s3 = new TreeSet<data-type>();  
public class InterfaceHashsetColl {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		
		set.add("AAAA");  
		set.add("BBBB");  
		set.add("CCCC");  
		set.add("BBBB");  
		
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("/////////Set Interface HashSet Collection............");
	}
}