package basics;
import java.util.*;
public class Sort1ByObjects {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}

}
