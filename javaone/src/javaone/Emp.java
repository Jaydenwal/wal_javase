package javaone;

public class Emp
{
	String name;
	double salary;
	
	//��Ǯ
	void addsalary()
	{//ע��ֲ������������Բ���ֵ
		//���ǵ��õ�ʱ����븳ֵ
		double extrasalary=500;
		salary=salary+extrasalary;
		System.out.println(salary);
	}
	
	
	
	//��ں���
	public static void main(String[] args)
	{
		Emp one = new Emp();
		one.name="���";
		one.salary=1000;
//		one.addsalary();
		System.out.println("����Ϊ��"+one.salary);
		one.addsalary();
		
		Emp two = new Emp();
		two.name="����Т";
		two.salary=1500;
		System.out.println("����Ϊ��"+two.salary);
		two.addsalary();
		
	}

}
