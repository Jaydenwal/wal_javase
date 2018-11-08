package javaone;

public class StuOne
{
	//学生姓名
	String name;
	
	
	//学生年龄
	byte age;
	
	//学校名称
	static String schoolname;
	
	//学生数量
	static int count;
	
	

	public static void main(String[] args)
	{
		//静态方法可以直接使用静态变量
		//schoolname="南京科技职业学院";
		
		//要访问这个类的实例变量，首先要创建这个类的实例对象
		StuOne one = new StuOne();
		one.name="余豪";
		one.age=36;
		System.out.println(one.schoolname+"      "+one.name+"      "+one.age);
		
		StuOne two= new StuOne();
		one.name="刘冬孝";
		one.age=42;
		System.out.println(two.schoolname+"      "+one.name+"      "+one.age);
		
		//改静态变量
		one.schoolname="杨子二中";
		System.out.println(two.schoolname);
	}

}
