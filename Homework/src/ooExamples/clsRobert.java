package ooExamples;

import java.text.ParseException;

public class clsRobert  extends clsPerson{
	     public float lvl;//生命值
		 private String robertName;
	     private float exp;
	     clsRobert(String par1, String par2, String par3, double par4, double par5,String _name)
			throws ParseException {
		
		super(par1, par2, par3, par4, par5);
		// TODO Auto-generated constructor stub
		lvl=100.0f;
		robertName=_name;
		
	}
	 //因为需求变更了，增加了两个属性，又不想费力再写一遍身高体重的输出，就对
    //父类的Display进行了改写（名字和父类一致），此时改写的目的，是实现对象显示信息
    //的一致性，即大家都调用Display来显示信息。当然如果不想改写，重写一个新的的方法
    //也可以
    public void Display()
    {
    	super.Display();
   	  	System.out.println("我是一个机器人！我的名字叫:"+robertName);
		System.out.println("我的生命值是:"+lvl);
		System.out.println("<<<<<<<<<<以上为个人信息>>>>>>>>>>>>>");
    }
    
}
