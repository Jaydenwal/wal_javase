package com.wal.ch2;

/**
 * һ���ི����.
 * 
 * 2���࣬����͸��࣬�̳�
 * 
 * 1.java�����е��඼���ڰ��¡�
 * 
 * 2.java�����е��඼��ֱ�ӻ��Ӽ̳�Object�ࡣ
 * Object��java�еĶ����࣬Ҳ���������ࡣ
 * 
 * java�����е��඼�Ǽ̳еġ�
 * 
 * ��ʽ�̳�:û��дextends ,ֱ�Ӽ̳�Object
 * ��ʾ�̳�:д��extends ���ֱ࣬�ӵ��̳�   ֻ����һ��ֱ�ӵİְ�
 * 
 * Ϊʲô�̳�?
 * 
 *  �����ظ��������࣬[���ٷ�������������]
 *
 */

public class Test
{
	
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.hashCode());
		
		//String�Ǹ��������ͣ�����:1.���Բ�new;2.String ���equals �Ƚϵ���ֵ
		Test t1 = new Test();
		System.out.println(t.equals(t1));//false
		
		//String ���equals �Ƚϵ���ֵ
		String s1 = new String("123");
		String s2 = new String("123");
		System.out.println(s1.equals(s2));//true
		
		
		//ֻ��String��equals�Ƚϵ���ֵ��������ȫ�ǱȽϵĵ�ַ
		
		StringBuffer  sb1 =  new StringBuffer("123");
		StringBuffer  sb2 =  new StringBuffer("123");
		System.out.println(sb1.equals(sb2));//false
		
		
	}

}
