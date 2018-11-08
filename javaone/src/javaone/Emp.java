package javaone;

public class Emp
{
	String name;
	double salary;
	
	//加钱
	void addsalary()
	{//注意局部变量声明可以不赋值
		//但是调用的时候必须赋值
		double extrasalary=500;
		salary=salary+extrasalary;
		System.out.println(salary);
	}
	
	
	
	//入口函数
	public static void main(String[] args)
	{
		Emp one = new Emp();
		one.name="余豪";
		one.salary=1000;
//		one.addsalary();
		System.out.println("工资为："+one.salary);
		one.addsalary();
		
		Emp two = new Emp();
		two.name="刘冬孝";
		two.salary=1500;
		System.out.println("工资为："+two.salary);
		two.addsalary();
		
	}

}
