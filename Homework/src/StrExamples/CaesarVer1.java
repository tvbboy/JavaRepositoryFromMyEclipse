package StrExamples;
/*
 * �޸ĺ�Ŀ������ܿ���ʵ����ASCii��Χ��ʵ��ȫ�ַ�����
 */
public class CaesarVer1 {
 
	String str; //Ŀ���ַ���
	int key; //�ƶ���λ��������Ϊ����
	CaesarVer1(String _str,int _key)
	{
		str=_str;
		key=_key;
	}
	//����������Ϊ���ܺͽ���ֻ���ƶ��ķ���
	//���Կ���ͨ��ƫ�������������������һ������
	//�Ϳ���ʵ�ּ��ܺͽ���
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
		System.out.print("ԭ�ַ���"+s);
		CaesarVer1 cas=new CaesarVer1(s,2);
		String sen=cas.Do();
		System.out.print("���ܺ�"+sen);
	    cas=new CaesarVer1(sen,-2);
		System.out.print("���ܺ�"+cas.Do());
	}

}
