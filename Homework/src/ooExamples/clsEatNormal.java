package ooExamples;
//���ฺ����ͨ�Է����߼���װ
public class clsEatNormal implements Ieatable {

	private String food;
	public void eat(clsPerson clp) {
		// TODO Auto-generated method stub
		System.out.print("���ڽ��������ĳԷ�");
		if(!clp.chkDeath())
		{
			if(food.equals("��"))
			{
				clp.fltWeight+=0.1;
				clp.fltHeight+=0.1;
			}
			else if(food.equals("��"))
			{
				clp.fltWeight+=0.2;
				clp.fltHeight+=0.2;
			}
			else
			{
				System.out.print("�ҳ��˲��óԵĶ�������������");
				clp.isHealth=false;
			}	
		}
		
	}
	public void setFood(String _food)
	{
		this.food=_food;
	}
}
