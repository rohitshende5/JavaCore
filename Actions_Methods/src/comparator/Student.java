package comparator;

public class Student {

	
	private int rollno;
	private String name;
	
	
	public Student(String name, int rollno)
	{
		
		this.name=name;
		this.rollno=rollno;
	}
	
	/*public String toString()
	{
		return this.name+"  "+this.rollno;
	}*/
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	
}
