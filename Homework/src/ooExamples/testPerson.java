package ooExamples;

import java.text.ParseException;

public class testPerson {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
    /*
		clsPerson mike=new clsPerson("2015-4-11", "男", "白", 7.7, 31.0); //构造了一个人mike
     mike.Born();
      mike.Display();
     mike.Eat("sss");
      mike.Display();
     */
	
    //  clsPerson micky=new clsStudent("2015-4-11", "男", "白", 7.7, 31.0,"张三","31021211014"); //构造了一个人mike
      clsStudent dock=new clsStudent("2015-4-11", "男", "白", 7.7, 31.0,"李四","31021211014"); //构造了一个人mike
     // micky.Display();
    //  micky.Eat("sss");
     // micky.Display();
      //动态的绑定，使得学生具备正常吃饭的状态
     // dock.Display();
     // clsEatNormal cen= new clsEatNormal();
   //   cen.setFood("面");
   //   dock.setEatable(cen);
  //    dock.Eat();     
    //  dock.Exam();//mick是不可以调用这个方法的
    //  dock.Death();
   //   dock.Display();
	 clsRobert gaoda=new clsRobert("2015-4-11", "男", "白", 7.7, 31.0,"高达"); //构造了一个机器人
	gaoda.Display();
	 clsEatEnergy cee= new clsEatEnergy();
   	 gaoda.setEatable(cee);
	 gaoda.Eat();
	 gaoda.Display();
	}

}
