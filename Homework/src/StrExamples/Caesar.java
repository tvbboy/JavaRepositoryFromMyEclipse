package StrExamples;

public class Caesar {

	String str; //Ŀ���ַ���
	int key; //�ƶ���λ��������Ϊ����
	Caesar(String _str,int _key)
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
		System.out.print("ԭ�ַ���"+s);
		Caesar cas=new Caesar(s,2);
		String sen=cas.Do();
		System.out.print("���ܺ�"+sen);
	    cas=new Caesar(sen,-2);
		System.out.print("���ܺ�"+cas.Do());
	}

}
