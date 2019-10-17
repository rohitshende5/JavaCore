package comparable;

import java.util.Set;
import java.util.TreeSet;

public class TestStu {

	
	public static void main(String[] args) {
		
		
		Student s1=new Student();
		
		s1.setName("rohit");
		s1.setRollno(102);
		
		Student s2=new Student();
		
		s2.setName("Aaksh");
		s2.setRollno(101);
		
		
		Set<Student> s=new TreeSet<>();
		
		s.add(s1);
		s.add(s2);
		
		for(Student stu:s)
		{
			System.out.println(stu.getName()+"   "+stu.getRollno());
		}
		
	}
	
	
}
