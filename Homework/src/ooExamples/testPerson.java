package ooExamples;

import java.text.ParseException;

public class testPerson {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
    /*
		clsPerson mike=new clsPerson("2015-4-11", "��", "��", 7.7, 31.0); //������һ����mike
     mike.Born();
      mike.Display();
     mike.Eat("sss");
      mike.Display();
     */
	
    //  clsPerson micky=new clsStudent("2015-4-11", "��", "��", 7.7, 31.0,"����","31021211014"); //������һ����mike
      clsStudent dock=new clsStudent("2015-4-11", "��", "��", 7.7, 31.0,"����","31021211014"); //������һ����mike
     // micky.Display();
    //  micky.Eat("sss");
     // micky.Display();
      //��̬�İ󶨣�ʹ��ѧ���߱������Է���״̬
     // dock.Display();
     // clsEatNormal cen= new clsEatNormal();
   //   cen.setFood("��");
   //   dock.setEatable(cen);
  //    dock.Eat();     
    //  dock.Exam();//mick�ǲ����Ե������������
    //  dock.Death();
   //   dock.Display();
	 clsRobert gaoda=new clsRobert("2015-4-11", "��", "��", 7.7, 31.0,"�ߴ�"); //������һ��������
	gaoda.Display();
	 clsEatEnergy cee= new clsEatEnergy();
   	 gaoda.setEatable(cee);
	 gaoda.Eat();
	 gaoda.Display();
	}

}
