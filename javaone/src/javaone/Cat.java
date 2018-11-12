package javaone;

public class Cat
{
	//小猫咪的名字
	private String name;
	
	
	//小猫咪的毛色
	private String color;
	
	
	public void show()
	{
		//this表示当前对象，表示，谁调用this就代表谁
		//this是不能用在静态方法中
		System.out.println(this.name+",毛色为："+this.color);
	}
	
	
	public static void main(String[] args)
	{
		Cat c1 = new Cat();
		c1.name="小花";
		c1.color="橘黄色";
		c1.show();
		
		
		Cat c2 = new Cat();
		c2.name="小白";
		c2.color="白色";
		c2.show();
		
	}

}
