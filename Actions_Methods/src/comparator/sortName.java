package comparator;

import java.util.Comparator;

public class sortName implements Comparator<Student>{

	public int compare(Student stu1, Student stu2)
	{
	return stu1.getRollno()-stu2.getRollno();
	}
}
