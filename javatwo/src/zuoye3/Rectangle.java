package zuoye3;

/*
 * 1.��1������һ������Person����֪ʶ�㣺����Ĵ�����ʹ�ã�
 *       1)����һ������sayHello()��������Է������ʺ��hello,my nameis XXX�� 
 *       2)���������ԣ����֡���ߡ����� 
 *   ��2������һ��PersonCreate�ࣺ
 *       1�������������󣬷ֱ���zhangsan��1.73��55��lishi��1.80��65 
 *       2���ֱ���ö����sayHello()������
 *       
 * 2.��1������һ������Person����֪ʶ�㣺����Ĵ�����ʹ�ã� 
 *       1)����һ������sayHello()��������Է������ʺ��hello,my nameis XXX�� 
 *       2)���������ԣ����֡���ߡ�����
 *       3)ͨ�����췽�����ֱ���������Ը�ֵ 
 *   ��2������һ��Constructor�ࣺ
 *       1�������������󣬷ֱ���zhangsan��1.73��55��lishi��1.80��65 
 *       2���ֱ���ö����sayHello()������
 * 
 * 3����1������һ��������Rectangle��
 *       1)��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ���
 *       2)��2�����ԣ���length����width
 *      3)ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ
 */


public class Rectangle
{
	//�L
	int length;
	//��
	int width;
	//��e
	double area;
	//���L
	double per;
	
	//���췽��
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	//	System.out.println("�L�飺"+length+"�����飺"+width);
	}
	
	//showAll()
	public void showAll()
	{
		System.out.println("�L�飺"+length+"�����飺"+width+"����e�飺"+area+",���L�飺"+per);
	}
	

	
	public double getArea()
	{
		return this.area;
	}
	public void setArea(int length,int width)
	{
		this.area = this.length*this.width;
	}
	
	
	public double getPer()
	{
		return this.per;
	}
	public void setPer(int length,int width)
	{
		this.per=(this.length+this.width)*2;
	}
	
	
	public static void main(String[] args)
	{
		Rectangle re = new Rectangle(7,8);
		re.setArea(re.length,re.width);
		re.setPer(re.length,re.width);
		re.showAll();
	}

}
