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

		// �����ַ�������
		String s1 = new String();
		String s2 = new String("Hello World");
		String s3 = new String("\u0048\u0065\u006c\u006c\u006f\u0020\u0057\u006f\u0072\u006c\u0064");
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		

		char chars[] = { 'a', 'b', 'c', 'd', 'e' };
		// ͨ���ַ����鴴���ַ�������
		String s4 = new String(chars);
		// ͨ�����ַ����鴴���ַ�������
		String s5 = new String(chars, 1, 4);
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);

		byte bytes[] = { 97, 98, 99 };
		// ͨ��byte���鴴���ַ�������
		String s6 = new String(bytes);
		System.out.println("s6 = " + s6);
		System.out.println("s6�ַ������� = " + s6.length());

	}
}
