package RandomExamples;
import java.util.Random;

public class RandomApp {
	/*
	 * �����涨��������ĳ����Χ�������
	 * randomNums ����
	 * range ��Χ
	 */
	public double[] ProduceRandom(int randomNums,double range)
	{
		double[] arr;
		arr=new double[randomNums];
		Random rd=new Random();
		int i=0;
		while (i<randomNums)
		{
			/*
			 * nextDouble()����0.0~1֮��
			 */
			
			double m=rd.nextDouble()*range;
			for(int j=0;j<=i;j++)
				if(arr[j]==m)
					continue;
			arr[i]=m;
			i++;
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomApp ra=new RandomApp();
		double[] arr= ra.ProduceRandom(10,100);
		for (int i=0;i<10;i++)
			System.out.println(arr[i]);

	}

}
