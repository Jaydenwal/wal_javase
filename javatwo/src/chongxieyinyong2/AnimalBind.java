package chongxieyinyong2;

public class AnimalBind
{
	
	public void  execute(Animal  an)
	{
		if(an  instanceof  Cat)
		{
			System.out.println("����һֻ�ɰ���è");
		}
		else
		{
			System.out.println("����һ�����õĹ�");
		}
	}

}
