package basics;
import java.util.*;
public class Sort1ByObjectsReverse {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Abdul");    
		al.add("Bashir");    
		al.add("Cotck");    
		al.add("Khan");   
      
		Collections.sort(al,Collections.reverseOrder());  
		Iterator i=al.iterator();  
		
		while(i.hasNext())  {  
			System.out.println(i.next());  
		}
		System.out.println("Sort By Objects Reverse Order");
	}
}