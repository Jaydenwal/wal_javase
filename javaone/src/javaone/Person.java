package javaone;

public class Person
{
	//姓名
	private String name;
	//年龄
	private int age;
	
	//所在城市名称，属于这个类，所以用静态方法
	// 城市名称 不仅仅属于哪个个体的，而是属于所有对象的一个属性
    // 属于整个Person类的
    // 静态变量 类变量
	static String cityName;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	
	
	public void setAge(int age)
	{
		if(age>0&&age<=250)
		{
			// this表示的是当前对象,谁调用这个方法，this就是谁
			this.age=age;
		}
		else 
		{
			System.out.println("对不起，您的年龄不符合规定！");
		}
		
	}
	public int getAge()
	{
		if(this.age>0&&this.age<=250)
		{
			// this表示的是当前对象,谁调用这个方法，this就是谁
			return this.age;
		}
		else 
		{
			return 0;
		}
		
	}
	
	
	
//	//入口函数
//	public static void main(String[] args)
//	{
//		//对实例变量的访问，就是访问值或是设置值
//		//必须首先创建这个类的对象
//	    //Person是这个创建对象的模板
//		Person p1 = new Person();
//		//赋值，设置值
//		p1.name="郑传磊";
//		p1.age=36;
//		System.out.println(p1.name+","+p1.age);
//		
//		p1.cityName="蓝鲸";
//		//静态变量也叫做类变量，建议大家今后采用类名.静态变量名
//		Person.cityName="石头城";
//		
//		Person p2 = new Person();
//		System.out.println(p2.name+","+p2.age+"城市名称为："+p2.cityName);
//		
//		
//		System.out.println(p1.name+","+p1.age+"城市名称为："+p1.cityName);
//		
//		
//		//引用类型赋值，实际是把这个对象的地址赋值
//		p2=p1;
//		System.out.println(p2.name+","+p2.age+"城市名称为："+p2.cityName);
//		
//				
//	}

}
