package javaone;


/**
 * 1.��Person�����Լ������Լ� 2.������һ����Managerȥ ����Person���е�����
 * 
 * 
 * 
 * 
 */
public class Manage
{
	// ��Manager����ȥ����Person���е�����

			//this ����ʹ���ھ�̬������
			public static void main(String[] args)
			{
				//��ʵ�������ķ��ʣ����Ƿ���ֵ��������ֵ
				//�������ȴ��������Ķ���
			    //Person��������������ģ��
				Person p2 = new Person();
				p2.setName("������");
				p2.setAge(20);
				Person.cityName="ʯͷ��";
				System.out.println("����Ϊ:" + p2.getName() + ",����Ϊ:" + p2.getAge());
			}

}
