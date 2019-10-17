package comparator;

import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		
		
		Student stu1=new Student("robit", 101);
		Student stu2=new Student("manesg", 102);
		//Student s2=new Student("rajat", 100);
		
		
		Set<Student> set=null;
		
		set=new TreeSet<>(new sortName());
	//	set=new TreeSet<>(new sortRollno());
		
		
		for(Student val: set)
		{
			System.out.println(val.getName()+"   "+val.getRollno());
			
		}
		
		
	}
	
	
}
