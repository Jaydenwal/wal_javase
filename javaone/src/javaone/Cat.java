package javaone;

public class Cat
{
	//Сè�������
	private String name;
	
	
	//Сè���ëɫ
	private String color;
	
	
	public void show()
	{
		//this��ʾ��ǰ���󣬱�ʾ��˭����this�ʹ���˭
		//this�ǲ������ھ�̬������
		System.out.println(this.name+",ëɫΪ��"+this.color);
	}
	
	
	public static void main(String[] args)
	{
		Cat c1 = new Cat();
		c1.name="С��";
		c1.color="�ٻ�ɫ";
		c1.show();
		
		
		Cat c2 = new Cat();
		c2.name="С��";
		c2.color="��ɫ";
		c2.show();
		
	}

}
