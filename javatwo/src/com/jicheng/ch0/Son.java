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
		Base base = son;//------>��son��ֵ�Ѿ���ֵ�������ˣ�������г�ȡ������ͬ���������Ե���������������̳С�
		//�����ȡ���࣬Ҳ��������������
		// ����ĳ�Ա������������̳У���ͬӵ��
		System.out.println(base.a + "," + base.b);//2,2

		System.out.println("--------------------------------");

		base.addA();
		System.out.println(son.a + "," + son.b);// 8,2

		// ��̬����Ҳ�����෽�����������ĸ��࣬���������ĸ��������Ծ��������ĸ���̬������
		// ���������Ķ�����������
		base.addB();
		System.out.println(son.a + "," + son.b);// 8,7
		
		son.addB();//b�Ѿ����7��
		System.out.println(son.a + "," + son.b);//8,14

	}

}
