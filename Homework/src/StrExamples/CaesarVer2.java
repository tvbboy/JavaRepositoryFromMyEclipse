package StrExamples;
/*
 * 改进2，字母按照字典范围内移动，比如a--c,z--b
 * 数字按照ascii范围内移动
 * 其余不发生改变
 */
public class CaesarVer2 {

	String str; //目标字符串
	int key; //移动的位数，可以为负数
	CaesarVer2(String _str,int _key)
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
			if(c>='a' && c<='z')
			{
				c+=key % 26;
				if(c<'a')
					c+=26;
				if(c>'z')
					c-=26;
			}
			else if(c>='A' && c<='z')
			{
				c+=key % 26;
				if(c<'A')
					c+=26;
				if(c>'Z')
					c-=26;
			}
			else if(c>='0' && c<='9')
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
		String s="freedom";
		System.out.print("原字符串"+s);
		CaesarVer2 cas=new CaesarVer2(s,2);
		String sen=cas.Do();
		System.out.print("加密后"+sen);
	    cas=new CaesarVer2(sen,-2);
		System.out.print("解密后"+cas.Do());
	}

}
