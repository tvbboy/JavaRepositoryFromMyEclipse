package ooExamples;

import java.text.ParseException;

public class clsRobert  extends clsPerson{
	     public float lvl;//����ֵ
		 private String robertName;
	     private float exp;
	     clsRobert(String par1, String par2, String par3, double par4, double par5,String _name)
			throws ParseException {
		
		super(par1, par2, par3, par4, par5);
		// TODO Auto-generated constructor stub
		lvl=100.0f;
		robertName=_name;
		
	}
	 //��Ϊ�������ˣ��������������ԣ��ֲ��������дһ��������ص�������Ͷ�
    //�����Display�����˸�д�����ֺ͸���һ�£�����ʱ��д��Ŀ�ģ���ʵ�ֶ�����ʾ��Ϣ
    //��һ���ԣ�����Ҷ�����Display����ʾ��Ϣ����Ȼ��������д����дһ���µĵķ���
    //Ҳ����
    public void Display()
    {
    	super.Display();
   	  	System.out.println("����һ�������ˣ��ҵ����ֽ�:"+robertName);
		System.out.println("�ҵ�����ֵ��:"+lvl);
		System.out.println("<<<<<<<<<<����Ϊ������Ϣ>>>>>>>>>>>>>");
    }
    
}
