import java.util.*;
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);    //Scanner类
	     System.out.println("请输入一个正整数:");
	     int intNum = in.nextInt();    //接收int数据
	     if(intNum %2==0)
	    	 System.out.print("偶数");
	     else
	    	 System.out.print("奇数");
	}

}
