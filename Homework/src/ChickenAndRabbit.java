/**
 * 
 */

/**
 * @author tvbboy
 * 利用单个循环实现鸡兔同笼。35头，94足
 *
 */
public class ChickenAndRabbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int intChickens,intRabbits=0;
        for(intChickens=0;intChickens<=35;intChickens++)
        {
        	intRabbits=35-intChickens;
        	if(intChickens*2+intRabbits*4==94)
        	{
        		System.out.print("鸡有"+intChickens+"只，兔子有"+intRabbits+"只");
        		break;//找到答案之后，跳出循环for，程序结束
        	}
        }
	}

}
