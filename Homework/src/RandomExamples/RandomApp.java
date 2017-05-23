package RandomExamples;
import java.util.Random;

public class RandomApp {
	/*
	 * 产生规定数量的在某个范围内随机数
	 * randomNums 数量
	 * range 范围
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
			 * nextDouble()产生0.0~1之间
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
