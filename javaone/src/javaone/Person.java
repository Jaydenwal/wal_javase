package javaone;

public class Person
{
	//����
	private String name;
	//����
	private int age;
	
	//���ڳ������ƣ���������࣬�����þ�̬����
	// �������� �����������ĸ�����ģ������������ж����һ������
    // ��������Person���
    // ��̬���� �����
	static String cityName;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	
	
	public void setAge(int age)
	{
		if(age>0&&age<=250)
		{
			// this��ʾ���ǵ�ǰ����,˭�������������this����˭
			this.age=age;
		}
		else 
		{
			System.out.println("�Բ����������䲻���Ϲ涨��");
		}
		
	}
	public int getAge()
	{
		if(this.age>0&&this.age<=250)
		{
			// this��ʾ���ǵ�ǰ����,˭�������������this����˭
			return this.age;
		}
		else 
		{
			return 0;
		}
		
	}
	
	
	
//	//��ں���
//	public static void main(String[] args)
//	{
//		//��ʵ�������ķ��ʣ����Ƿ���ֵ��������ֵ
//		//�������ȴ��������Ķ���
//	    //Person��������������ģ��
//		Person p1 = new Person();
//		//��ֵ������ֵ
//		p1.name="֣����";
//		p1.age=36;
//		System.out.println(p1.name+","+p1.age);
//		
//		p1.cityName="����";
//		//��̬����Ҳ����������������ҽ���������.��̬������
//		Person.cityName="ʯͷ��";
//		
//		Person p2 = new Person();
//		System.out.println(p2.name+","+p2.age+"��������Ϊ��"+p2.cityName);
//		
//		
//		System.out.println(p1.name+","+p1.age+"��������Ϊ��"+p1.cityName);
//		
//		
//		//�������͸�ֵ��ʵ���ǰ��������ĵ�ַ��ֵ
//		p2=p1;
//		System.out.println(p2.name+","+p2.age+"��������Ϊ��"+p2.cityName);
//		
//				
//	}

}
