package basics;
import java.util.*;
public class ArrayListColl {

	public static void main(String[] args) {
		//Creating arraylist 
		ArrayList<String> list=new ArrayList<String>(); 
		
		//Adding object in arraylist 
		list.add("Sharifullah"); 
		list.add("Irfanullah");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		System.out.println("The End.........!");
	}
}
