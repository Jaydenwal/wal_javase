package com.jicheng.ch0;

public class Son extends Base
{

	Son()
	{

		a = 2;
		b = 2;
	}

	public void addA()
	{
		a += 6;
	}

	public static void addB()
	{
		b += 7;
	}

	public static void main(String[] args)
	{
		Son son = new Son();
		System.out.println(son.a + "," + son.b);//2,2

		System.out.println("--------------------------------");
		Base base = son;//------>把son的值已经赋值给父类了，父类具有抽取子类相同方法和属性的能力，并给子类继承。
		//父类抽取子类，也就是子类给父类的
		// 父类的成员变量都被子类继承，共同拥有
		System.out.println(base.a + "," + base.b);//2,2

		System.out.println("--------------------------------");

		base.addA();
		System.out.println(son.a + "," + son.b);// 8,2

		// 静态方法也叫做类方法，是属于哪个类，而不属于哪个对象，所以决定调用哪个静态方法，
		// 是由声明的对象来决定的
		base.addB();
		System.out.println(son.a + "," + son.b);// 8,7
		
		son.addB();//b已经变成7了
		System.out.println(son.a + "," + son.b);//8,14

	}

}
