package ooExamples;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
 * �������������һ��Class 2017-4-25
 */
public class clsPerson   {
	/*
	 * ���������������
	 * 
	 */
	private String strGender;//�Ա�
	private int  intAge ; //����
	public double fltWeight;//���أ���λ�
	public double fltHeight;//��ߣ���λcm��
	private String strSkin;//��ɫ
	private Date dteBirthdate;//��������
	private boolean isDead;//�Ƿ�����
	public boolean isHealth;//����״��
	Ieatable ieatable;//�����˳Ե���Ϊ�ӿ�
	
	/*
	 * ����������ķ���
	 * 
	 */
	//�÷������˳����������ǳ��������£��Ա𣬷�ɫ�����أ����
	//��������ͬ�ķ����й��췽������ʼ��һ������ʵ����ʱ�������ִ��������췽��
	 clsPerson(String par1,String par2,String par3,double par4,double par5) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		dteBirthdate = sdf.parse(par1); //���ַ������͵�����תΪ��������
		Date dt=new Date();//��ǰ����
		strSkin=par3;//������ɫ
		strGender=par2;//�����Ա�
		intAge= dt.getYear()-dteBirthdate.getYear();;//��������
		fltWeight=par4;//��������
		fltHeight=par5;//�������
		isDead=false;//����û������
		isHealth=true;//�����Ƿ񽡿�
	}
	 public void Eat()
	 {
		 ieatable.eat();
	 }
	 public void Eat(String food)
	 {
		 ieatable.eat(this,food);
	 }
	 //ͨ���÷��������Զ�̬Ϊ���������Ϊ�����磬��һ��ĳ��ѧ����ɻ�������......
	public void setEatable(Ieatable ieatable)
	{
		this.ieatable=ieatable;
	}
	//����Ϊ˯����ʱ�䵥λ��Сʱ��
	private void Sleep(int par1) 
	{
		if(!chkDeath())//���û������
		{
			if(par1>10)
			{
				System.out.print("��������˯��ʱ����ò�Ҫ����10Сʱ");
				isHealth=false;
			}
			else
			{
				fltWeight+=0.02*par1;
				fltHeight+=0.03*par1;
			}
		}
	}
	
	//����Ϊ�ɳ���ʱ��(��λ��)
	private void Grow(int par1)
	{
		if(!chkDeath())
			intAge+=par1;
	}
	//��final���εķ�����ֻ�ܱ�������ã����ܱ���д���޸�
	public final void Death()
	{
		isDead=true;
		isHealth=false;
		
	}
	//����һ�����Ƿ�����
	public boolean chkDeath()
	{
		if(isDead)
		{
			System.out.print("�����Ѿ�����");
			
		}
		return isDead;
	}
	//��ʾ����˵�״̬
	public void Display()
	{
		System.out.println("���:"+fltHeight);
		System.out.println("����:"+fltWeight);
		System.out.println("�Ա�:"+strGender);
		System.out.println("��ɫ:"+strSkin);
		System.out.println("����:"+intAge);
		System.out.println("��������:"+dteBirthdate);
		System.out.println("�Ƿ����:"+!isDead);
		System.out.println("�Ƿ񽡿�:"+isHealth);
		System.out.println("<<<<<<<<<<����Ϊ������Ϣ>>>>>>>>>>>>>");
	}
}

