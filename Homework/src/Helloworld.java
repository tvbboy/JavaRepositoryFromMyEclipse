import java.util.*;
public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int intNumA=10;
       int intNumB=3;
      
       System.out.println(intNumA/intNumB);
       Scanner in = new Scanner(System.in);    //Scanner类
       System.out.println("Please input a float number:");
       int a = in.nextInt();    //接收int数据
       System.out.println(a);    //这里试了一下输入String数据，但中间有空格就不能显示，Scanner类还不具有这功能
       System.out.println("Please input a string: ");    //这里试了一下输入String数据，但中间有空格就不能显示，Scanner类还不具有这功能
      // Scanner str = new Scanner(System.in);
       System.out.println("The string is :" + in.next());
	}

}
