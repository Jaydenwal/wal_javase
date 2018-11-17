package zuoye1;

public class Constructor extends Person3
{
	
	Constructor(String name,double height,double weight)
	{
		super("null",5,5);
		System.out.println("姓名："+name+",身高："+height+",体重:"+weight);
	}
	
	public static void main(String[] args)
	{
	
		Constructor c1 = new Constructor("zhangsan",1.73,55);
		c1.sayHello("zhangsan");

		Constructor c2 = new Constructor("lisi",1.80,65);
		c2.sayHello("lisi");

	}

}
