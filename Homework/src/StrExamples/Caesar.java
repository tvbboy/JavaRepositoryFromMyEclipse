package StrExamples;

public class Caesar {

	String str; //目标字符串
	int key; //移动的位数，可以为负数
	Caesar(String _str,int _key)
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
			if(c>'a' && c<'z')
			{
				c+=key % 26;
				if(c<'a')
					c+=26;
				if(c>'z')
					c-=26;
			}
			else if(c>'A' && c<'z')
			{
				c+=key % 26;
				if(c<'A')
					c+=26;
				if(c>'Z')
					c-=26;
			}
			result+=c;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="freedom";
		System.out.print("原字符串"+s);
		Caesar cas=new Caesar(s,2);
		String sen=cas.Do();
		System.out.print("加密后"+sen);
	    cas=new Caesar(sen,-2);
		System.out.print("解密后"+cas.Do());
	}

}
