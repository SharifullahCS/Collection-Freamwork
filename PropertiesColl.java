package basics;
import java.util.*;
public class PropertiesColl {
	public static void main(String[] args) {
		
		System.out.println("Ex PropertiesClass to get all the system properties");
		Properties p=System.getProperties();
		Set set=p.entrySet(); 
		
		Iterator itr=set.iterator();  
		
		while(itr.hasNext()){  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" = "+entry.getValue());  
		}
		
		System.out.println("///////////////////....THE END...///////////////////");
	}
}