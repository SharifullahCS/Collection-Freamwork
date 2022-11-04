package basics;
import java.util.*;


class Student implements Comparable<Student> {  
    public String name;  
    public Student(String name) {  
    	this.name = name;  
    }
    
    public int compareTo(Student person) {  
    	return name.compareTo(person.name);
    } 
} 


public class Sort3byUserDefineColle {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
	    al.add(new Student("Ali Gul"));  
	    al.add(new Student("Bilal"));  
	    al.add(new Student("Tahir"));  
	    al.add(new Student("Zakir"));  
	      
	    Collections.sort(al);  
	    for (Student s : al) {
	    	System.out.println(s.name);  
	    } 
		
	}
}