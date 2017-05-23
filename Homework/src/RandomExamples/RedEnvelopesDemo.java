package RandomExamples;

import java.util.Random;
/*
 * ģ��΢�ź����˼·���ܶ���Ը�������ƽ��ֵ���ڲ������
 * ���һ��������ܶ��ȥ�������еĺ��
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
