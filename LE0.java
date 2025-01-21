public class Main
{
	String name;
	int age;
	
	void setName(String name)
	{
	    this.name=name;
	}
	
	void setAge(int age)
	{
	    this.age=age;
	}
	
	String getName()
	{
	    return this.name;
	}
	
	int getAge()
	{
	    return this.age;
	}
	
	public static void main(String[] args) {
		Main student=new Main();
		student.setName("Harshit");
		student.setAge(20);
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
}
