package zuoye;

public class PersonCreate
{
	
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.sayHello("zhangsan");
		p1.height=1.73;
		p1.weight=55;
		p1.name="zhangsan";
		System.out.println("hello,my name is��"+p1.name+",����ǣ�"+p1.height+",�����ǣ�"+p1.weight);

		
		Person p2 = new Person();
		p2.sayHello("lisi");
		p2.height=1.80;
		p2.weight=65;
		p1.name="lisi";
		System.out.println("hello,my name is��"+p2.name+",����ǣ�"+p2.height+",�����ǣ�"+p2.weight);
	}

}
