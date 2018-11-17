package com.wal.ch2;

/**
 * 一个类讲完了.
 * 
 * 2个类，子类和父类，继承
 * 
 * 1.java中所有的类都是在包下。
 * 
 * 2.java中所有的类都是直接或间接继承Object类。
 * Object是java中的顶级类，也就是祖宗类。
 * 
 * java中所有的类都是继承的。
 * 
 * 隐式继承:没有写extends ,直接继承Object
 * 显示继承:写了extends 父类，直接单继承   只能有一个直接的爸爸
 * 
 * 为什么继承?
 * 
 *  减少重复代码冗余，[减少方法级代码冗余]
 *
 */

public class Test
{
	
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.hashCode());
		
		//String是个引用类型，特殊:1.可以不new;2.String 类的equals 比较的是值
		Test t1 = new Test();
		System.out.println(t.equals(t1));//false
		
		//String 类的equals 比较的是值
		String s1 = new String("123");
		String s2 = new String("123");
		System.out.println(s1.equals(s2));//true
		
		
		//只有String的equals比较的是值，其他的全是比较的地址
		
		StringBuffer  sb1 =  new StringBuffer("123");
		StringBuffer  sb2 =  new StringBuffer("123");
		System.out.println(sb1.equals(sb2));//false
		
		
	}

}
