package ooExamples;
//���ฺ����ͨ�Է����߼���װ
public class clsEatNormal implements Ieatable {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("���ڽ��������ĳԷ�");
		
		
	}
	public void eat(clsPerson clp,String food) {
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
}
