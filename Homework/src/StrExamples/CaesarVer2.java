package StrExamples;
/*
 * �Ľ�2����ĸ�����ֵ䷶Χ���ƶ�������a--c,z--b
 * ���ְ���ascii��Χ���ƶ�
 * ���಻�����ı�
 */
public class CaesarVer2 {

	String str; //Ŀ���ַ���
	int key; //�ƶ���λ��������Ϊ����
	CaesarVer2(String _str,int _key)
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
		System.out.print("ԭ�ַ���"+s);
		CaesarVer2 cas=new CaesarVer2(s,2);
		String sen=cas.Do();
		System.out.print("���ܺ�"+sen);
	    cas=new CaesarVer2(sen,-2);
		System.out.print("���ܺ�"+cas.Do());
	}

}
