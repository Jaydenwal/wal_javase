package com.wal.ch0;

public class Base
{
	
	static
	{
		System.out.println("父类的静态块");
	}
	
	{
		System.out.println("父类的构造块");
	}
	
	Base()
	{
		System.out.println("父类的构造函数");
	}
	
	public static void main(String[] args)
	{
		Base b = new Base();
	}

}
