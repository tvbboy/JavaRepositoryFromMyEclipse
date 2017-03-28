import java.util.*;
public class ArranTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);    //Scanner类
		int score1[];//声明
		score1=new int[3];//申请内存地址	
		int score2[]=new int[3];//一个语句表达了声明和申请内存地址
		for (int i=0;i<score2.length;i++)
		{
			 System.out.println("请输入第"+(i+1)+"个数:");
	         int intNum = in.nextInt();    //接收string数据
			 score2[i]=intNum;
		}
		int max=score2[0];
		int min=score2[0];
		int sum=0;
		for (int i=0;i<score2.length;i++)
		{
			sum+=score2[i];
			if(max<=score2[i])//始终保持max是最大值
				max=score2[i];
			if(min>=score2[i])//始终保持min是最小值
				min=score2[i];
			System.out.print(score2[i]+" ");
			//System.out.print("\n");
		}
		System.out.println("最大值是"+max);
		System.out.println("最小值是"+min);
		System.out.println("平均值是"+((float)sum)/score2.length);
	}

}
