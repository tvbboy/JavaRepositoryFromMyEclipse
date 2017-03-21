import java.util.*;
public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);    //Scanner类
	     System.out.println("请输入四季中的任何一个:");
	     String strSeason = in.next();    //接收string数据
		 if(strSeason.equals("春"))
		 {
			 System.out.println("请到婺源看油菜花");
			 
		 }
		 else if(strSeason.equals("夏"))
		 {
			 System.out.println("请到哈尔滨");
			 
		 }
		 else if(strSeason.equals("秋"))
		 {
			 System.out.println("请到北京香山");
			 
		 }
		 else if(strSeason.equals("冬"))
		 {
			 System.out.println("请到三亚");
			 
		 }
		 else
		 {
			 System.out.println("输入有误");
		 }
		
		
	}

}
