package ooExamples;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
 * 这是描述人类的一个Class
 */
public class clsPerson {
	/*
	 * 下面是人类的属性
	 * 
	 */
	private String strGender;//性别
	private String strName; //姓名
	private int  intAge ; //年龄
	private double fltWeight;//体重（单位斤）
	private double fltHeight;//身高（单位cm）
	private String strSkin;//肤色
	private Date dteBirthdate;//出生日期
	private boolean isDead;//是否死亡
	
	/*
	 * 下面是人类的方法
	 * 
	 */
	//该方法是人出生，参数是出生的年月，性别，肤色，体重，身高
	public void Born(String par1,String par2,String par3,double par4,double par5) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		dteBirthdate = sdf.parse(par1); //把字符串类型的日期转为日期类型
		strSkin=par3;//决定肤色
		strGender=par2;//决定性别
		intAge=0;//决定年龄
		fltWeight=par4;//决定体重
		fltHeight=par5;//决定身高
		isDead=false;//决定没有死亡
	}
	private void Eat()
	{
		if(!chkDeath())
		{
			 fltWeight+=0.1;
			 fltHeight+=0.1;
		}
	}
	//参数为睡觉的时间单位（小时）
	private void Sleep(int par1) 
	{
		if(!chkDeath())//如果没有死亡
		{
			if(par1>10)
			{
				System.out.print("人正常的睡眠时间最好不要超过10小时");
			}
			else
			{
				fltWeight+=0.02*par1;
				fltHeight+=0.03*par1;
			}
		}
	}
	//参数为成长的时间(单位年)
	private void Grow(int par1)
	{
		chkDeath();
		intAge+=par1;
	}
	public void Death()
	{
		isDead=true;
		
	}
	//检验一个人是否死亡
	private boolean chkDeath()
	{
		if(isDead)
		{
			System.out.print("该人已经死亡");
			
		}
		return isDead;
	}
	//显示这个人的状态
	public void Display()
	{
		System.out.println("身高:"+fltHeight);
		System.out.println("体重:"+fltWeight);
		System.out.println("性别:"+strGender);
		System.out.println("肤色:"+strSkin);
		System.out.println("年龄:"+intAge);
		System.out.println("出生日期:"+dteBirthdate);
		System.out.println("是否活着:"+!isDead);
	}
}

