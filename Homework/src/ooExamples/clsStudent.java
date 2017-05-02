package ooExamples;

import java.text.ParseException;
/*
 * 这是描述学生类的一个Class，这个类继承了clsPerson
 */
public class clsStudent extends clsPerson implements IPerson {
     private String studentNumber;
     private String studentName;
     private float score;
     private float exp;
     clsStudent(String par1,String par2,String par3,double par4,double par5,String _name,String _number) throws ParseException
     {
    	 super(par1, par2, par3, par4, par5);//调用父类的构造方法，super父类的意思
    	 studentNumber=_number;
    	 studentName=_name;
    	 score=0;
    	 exp=0;
    	 ieatable=new clsEatNormal();//定义了学生是正常的吃饭状态
     }
     //因为需求变更了，增加了两个属性，又不想费力再写一遍身高体重的输出，就对
     //父类的Display进行了改写（名字和父类一致），此时改写的目的，是实现对象显示信息
     //的一致性，即大家都调用Display来显示信息。当然如果不想改写，重写一个新的的方法
     //也可以
     public void Display()
     {
    	super.Display();
    	System.out.println("我是一个学生！我的名字叫:"+studentName);
 		System.out.println("我的学号是:"+studentNumber);
 		System.out.println("我的分数是:"+score);
 		System.out.println("<<<<<<<<<<以上为个人信息>>>>>>>>>>>>>");
     }
     //新建了一个方法考试
     public void Exam()
     {
    	 //随机数
    	 score = (float)(Math.random()*100); 
     }
	@Override
	public void Work(int hours) {
		// TODO Auto-generated method stub
		//如果工作了4个小时，EXP增加100
		//如果工作了8个小时，EXP增加200
		//如果超过了8个小时，EXP减少100，同时这个人变为不健康
	}
	

    
     
}
