package com.wal.ch0;

public class Son  extends Base
{
	
	static
	{
		System.out.println("子类的静态块");
	}
	
	{
		System.out.println("子类的构造块");
	}
	
	Son()
	{
		System.out.println("子类的构造函数");
	}
	
	public static void main(String[] args)
	{
		//Son s  = new Son();
		
		Base b = new Base();
	}
	

}
