
import java.util.Scanner;

public class HowManyDays{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入年份：");
		int intYear = sc.nextInt();
		
		System.out.println("请输入月份：");
		int intMonth = sc.nextInt();
		
		System.out.println("请输入日：");
		int intDay = sc.nextInt();
		
		System.out.println("你输入的日期是：" + intYear + "年" + intMonth + "月" + intDay + "日");
			
			
		//判断year是否合法
		if(intYear < 0){
			System.out.println("请输入正确日期！");
			System.exit(0);
		}
		//判断year是否合法结束
		boolean isRun=false;
		if(intYear % 4 ==0 && intYear%100==0 || intYear%400==0){
			isRun=true;
		}
		
		//判断month、day是否合法
		switch(intMonth){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(intDay < 0 || intDay > 31){
					System.out.println("请输入正确日期！"+intMonth+"月中，日必须在1~31之间");
					System.exit(0);
				}
				break;
				
			case 4: case 6: case 9: case 11:
				if(intDay < 0 || intDay > 30){
					System.out.println("请输入正确日期！"+intMonth+"月中，日必须在1~30之间");
					System.exit(0);
				}
				break;
				
			case 2:
				if(isRun){
					
					if(intDay < 0 || intDay > 29){
						System.out.println("请输入正确日期！闰年日必须在0~29之间");
						System.exit(0);
					}
					
				}else{
					
					if(intDay < 0 || intDay > 28){
						System.out.println("请输入正确日期！非闰年日必须在0~28之间");
						System.exit(0);
					}
				}
				break;
				
			default:
				System.out.println("请输入正确日期,月份必须在1~12之间！");
				System.exit(0);
				break;
				
		}
		//判断month、day是否合法结束
		
		
		int intTotalDays = intDay;
		
		/*
			计算日期是当年的哪一天代码如下
		*/
		switch(intMonth - 1){
			
			case 11:
				intTotalDays = intTotalDays + 30;
			case 10:
				intTotalDays = intTotalDays + 31;
			case 9:
				intTotalDays = intTotalDays + 30;
			case 8:
				intTotalDays = intTotalDays + 31;
			case 7:
				intTotalDays = intTotalDays + 31;
			case 6:
				intTotalDays = intTotalDays + 30;
			case 5:
				intTotalDays = intTotalDays + 31;
			case 4:
				intTotalDays = intTotalDays + 30;
			case 3:
				intTotalDays = intTotalDays + 31;
				
			case 2:			//判断year是平年还是闰年
				if(isRun){
					intTotalDays = intTotalDays + 29;
				}else{
					intTotalDays = intTotalDays + 28;
				}
				
			case 1:
				intTotalDays = intTotalDays + 31;
				break;
		}
		//sum = sum + day;
		//计算完成
		
		
		System.out.println("你输入的日期是今年的第" + intTotalDays + "天");
	}
}