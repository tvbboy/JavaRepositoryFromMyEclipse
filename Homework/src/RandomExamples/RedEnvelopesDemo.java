package RandomExamples;

import java.util.Random;
/*
 * 模拟微信红包，思路是总额除以个数，在平均值以内产生红包
 * 最后一个红包是总额减去上面所有的红包
 */
public class RedEnvelopesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedEnvelopesDemo red=new RedEnvelopesDemo();
		double [] arr= red.generateDistribute(100,10);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public double[] generateDistribute(double totalMoney,int count)
	{
		Random rd=new Random();
		double[] tmp=new double[count];
		double usedMoney=0;
		for(int i=0;i<count-1;i++)
		{
			double m=rd.nextDouble()*(totalMoney/count);
			m = (double)(Math.round(m*100))/100;
			tmp[i]=m;
			usedMoney+=m;
		}
		tmp[count-1]= (double)(Math.round((totalMoney-usedMoney)*100))/100;
		return tmp;
	}

}
