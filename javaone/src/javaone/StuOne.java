package javaone;

public class StuOne
{
	//ѧ������
	String name;
	
	
	//ѧ������
	byte age;
	
	//ѧУ����
	static String schoolname;
	
	//ѧ������
	static int count;
	
	

	public static void main(String[] args)
	{
		//��̬��������ֱ��ʹ�þ�̬����
		//schoolname="�Ͼ��Ƽ�ְҵѧԺ";
		
		//Ҫ����������ʵ������������Ҫ����������ʵ������
		StuOne one = new StuOne();
		one.name="���";
		one.age=36;
		System.out.println(one.schoolname+"      "+one.name+"      "+one.age);
		
		StuOne two= new StuOne();
		one.name="����Т";
		one.age=42;
		System.out.println(two.schoolname+"      "+one.name+"      "+one.age);
		
		//�ľ�̬����
		one.schoolname="���Ӷ���";
		System.out.println(two.schoolname);
	}

}
