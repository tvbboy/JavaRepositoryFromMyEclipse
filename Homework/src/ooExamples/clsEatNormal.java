package ooExamples;
//该类负责普通吃饭的逻辑封装
public class clsEatNormal implements Ieatable {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("我在进行正常的吃饭");
		
		
	}
	public void eat(clsPerson clp,String food) {
		// TODO Auto-generated method stub
		System.out.print("我在进行正常的吃饭");
		if(!clp.chkDeath())
		{
			if(food.equals("饭"))
			{
				clp.fltWeight+=0.1;
				clp.fltHeight+=0.1;
			}
			else if(food.equals("面"))
			{
				clp.fltWeight+=0.2;
				clp.fltHeight+=0.2;
			}
			else
			{
				System.out.print("我吃了不该吃的东西！！！！！");
				clp.isHealth=false;
			}	
		}
		
	}
}
