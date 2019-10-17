package comparator;

import java.util.Comparator;

public class sortRollno implements Comparator<Student>
{
	
	public int compare(Student stu1, Student stu2)
	{
		
		return stu1.getName().compareTo(stu2.getName());
	}

	
	
	
	
}
