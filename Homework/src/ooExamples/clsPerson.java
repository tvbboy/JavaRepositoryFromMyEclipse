package ooExamples;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
 * 这是描述人类的一个Class 2017-4-25
 */
public class clsPerson   {
	/*
	 * 下面是人类的属性
	 * 
	 */
	private String strGender;//性别
	private int  intAge ; //年龄
	public double fltWeight;//体重（单位斤）
	public double fltHeight;//身高（单位cm）
	private String strSkin;//肤色
	private Date dteBirthdate;//出生日期
	private boolean isDead;//是否死亡
	public boolean isHealth;//健康状况
	Ieatable ieatable;//定义了吃的行为接口
	
	/*
	 * 下面是人类的方法
	 * 
	 */
	//该方法是人出生，参数是出生的年月，性别，肤色，体重，身高
	//和类名相同的方法叫构造方法，初始化一个对象实例的时候会首先执行这个构造方法
	 clsPerson(String par1,String par2,String par3,double par4,double par5) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		dteBirthdate = sdf.parse(par1); //把字符串类型的日期转为日期类型
		Date dt=new Date();//当前日期
		strSkin=par3;//决定肤色
		strGender=par2;//决定性别
		intAge= dt.getYear()-dteBirthdate.getYear();;//决定年龄
		fltWeight=par4;//决定体重
		fltHeight=par5;//决定身高
		isDead=false;//决定没有死亡
		isHealth=true;//决定是否健康
	}
	 public void Eat()
	 {
		 ieatable.eat();
	 }
	 public void Eat(String food)
	 {
		 ieatable.eat(this,food);
	 }
	 //通过该方法，可以动态为对象添加行为，比如，有一天某个学生变成机器人了......
	public void setEatable(Ieatable ieatable)
	{
		this.ieatable=ieatable;
	}
	//参数为睡觉的时间单位（小时）
	private void Sleep(int par1) 
	{
		if(!chkDeath())//如果没有死亡
		{
			if(par1>10)
			{
				System.out.print("人正常的睡眠时间最好不要超过10小时");
				isHealth=false;
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
		if(!chkDeath())
			intAge+=par1;
	}
	//被final修饰的方法，只能被子类调用，不能被重写，修改
	public final void Death()
	{
		isDead=true;
		isHealth=false;
		
	}
	//检验一个人是否死亡
	public boolean chkDeath()
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
		System.out.println("是否健康:"+isHealth);
		System.out.println("<<<<<<<<<<以上为个人信息>>>>>>>>>>>>>");
	}
}

