/*
* Created by �ǽݿ���
* ������վ��www.51work6.com 
* �ǽݿ������߿��ã�www.zhijieketang.com
* �ǽݿ���΢�Ź����ţ�zhijieketang
* ���䣺eorient@sina.com
* Java���߷���QQȺ��547370999
* �����׵����顿��ַ��
*       ͼ��������
*       http://www.ituring.com.cn/book/2480
*       �ٶ��Ķ���
*       https://yuedu.baidu.com/ebook/7c1499987e192279168884868762caaedd33ba00 
*/

public class HelloWorld {

	public static void main(String[] args) {

		String s1 = "Hello";
		// ʹ��+���������
		String s2 = s1 + " ";
		String s3 = s2 + "World";
		System.out.println(s3);

		String s4 = "Hello";
		// ʹ��+��������ӣ�֧��+=��ֵ�����
		s4 += " ";
		s4 += "World";
		System.out.println(s4);

		String s5 = "Hello";
		// ʹ��concat��������
		s5 = s5.concat(" ").concat("World");
		System.out.println(s5);

		int age = 18;
		String s6= "����������" + age + "�ꡣ";
		System.out.println(s6);
		
		char score = 'A';
		String s7= "����Ӣ��ɼ���" + score;
		System.out.println(s7);
		
		java.util.Date now = new java.util.Date();
		//����ƴ���Զ�����toString()����
		String s8= "�����ǣ�" + now;
		System.out.println(s8);
		
	}
}
