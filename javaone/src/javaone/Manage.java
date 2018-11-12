package javaone;


/**
 * 1.在Person类中自己访问自己 2.在另外一个类Manager去 访问Person类中的属性
 * 
 * 
 * 
 * 
 */
public class Manage
{
	// 在Manager类中去访问Person类中的属性

			
			public static void main(String[] args)
			{
				Person p2 = new Person();
				p2.setName("王安乐");
				p2.setAge(20);
				Person.cityName="石头城";
				System.out.println("姓名为:" + p2.getName() + ",年龄为:" + p2.getAge());
			}

}
