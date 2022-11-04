package basics;
import java.util.*;
public class Sort2byWrapperClassObj {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();  
		al.add(Integer.valueOf(111));  
		al.add(Integer.valueOf(222));  
		al.add(333);	//internally will be converted into objects as Integer.valueOf(333)
		
		
		Collections.sort(al);  
		  
		Iterator itr=al.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		 }
		
		System.out.println("////////////Sort 2 by Wrapper Class Objects..........");
	}
}