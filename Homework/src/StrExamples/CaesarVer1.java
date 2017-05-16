package StrExamples;
/*
 * 修改后的凯撒加密可以实现在ASCii范围内实现全字符加密
 */
public class CaesarVer1 {
 
	String str; //目标字符串
	int key; //移动的位数，可以为负数
	CaesarVer1(String _str,int _key)
	{
		str=_str;
		key=_key;
	}
	//凯撒处理，以为加密和解密只是移动的方向
	//所以可以通过偏移量的正负解决，所以一个函数
	//就可以实现加密和解密
	public String Do()
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>=0 && c<=119)
			{
				c+=key % 120;
				if(c<0)
					c+=120;
				if(c>119)
					c-=120;
			}
			
			result+=c;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@@324345&&**()(";
		System.out.print("原字符串"+s);
		CaesarVer1 cas=new CaesarVer1(s,2);
		String sen=cas.Do();
		System.out.print("加密后"+sen);
	    cas=new CaesarVer1(sen,-2);
		System.out.print("解密后"+cas.Do());
	}

}
