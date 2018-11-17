package zuoye3;

/*
 * 1.（1）定义一个人类Person：（知识点：对象的创建和使用）
 *       1)定义一个方法sayHello()，可以向对方发出问候语“hello,my nameis XXX” 
 *       2)有三个属性：名字、身高、体重 
 *   （2）定义一个PersonCreate类：
 *       1）创建两个对象，分别是zhangsan，1.73，55；lishi，1.80，65 
 *       2）分别调用对象的sayHello()方法。
 *       
 * 2.（1）定义一个人类Person：（知识点：对象的创建和使用） 
 *       1)定义一个方法sayHello()，可以向对方发出问候语“hello,my nameis XXX” 
 *       2)有三个属性：名字、身高、体重
 *       3)通过构造方法，分别给三个属性赋值 
 *   （2）定义一个Constructor类：
 *       1）创建两个对象，分别是zhangsan，1.73，55；lishi，1.80，65 
 *       2）分别调用对象的sayHello()方法。
 * 
 * 3．（1）定义一个矩形类Rectangle：
 *       1)定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
 *       2)有2个属性：长length、宽width
 *      3)通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
 */


public class Rectangle
{
	//長
	int length;
	//寬
	int width;
	//面積
	double area;
	//周長
	double per;
	
	//構造方法
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	//	System.out.println("長為："+length+"，寬為："+width);
	}
	
	//showAll()
	public void showAll()
	{
		System.out.println("長為："+length+"，寬為："+width+"，面積為："+area+",周長為："+per);
	}
	

	
	public double getArea()
	{
		return this.area;
	}
	public void setArea(int length,int width)
	{
		this.area = this.length*this.width;
	}
	
	
	public double getPer()
	{
		return this.per;
	}
	public void setPer(int length,int width)
	{
		this.per=(this.length+this.width)*2;
	}
	
	
	public static void main(String[] args)
	{
		Rectangle re = new Rectangle(7,8);
		re.setArea(re.length,re.width);
		re.setPer(re.length,re.width);
		re.showAll();
	}

}
