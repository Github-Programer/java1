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

		String sourceStr = "There is a string accessing example.";

		//����ַ�������
		int len = sourceStr.length();
		//�������λ��16���ַ�
		char ch = sourceStr.charAt(16);

		//�����ַ������ַ���
		int firstChar1 = sourceStr.indexOf('r');
		int lastChar1 = sourceStr.lastIndexOf('r');
		int firstStr1 = sourceStr.indexOf("ing");
		int lastStr1 = sourceStr.lastIndexOf("ing");
		int firstChar2 = sourceStr.indexOf('e', 15);
		int lastChar2 = sourceStr.lastIndexOf('e', 15);
		int firstStr2 = sourceStr.indexOf("ing", 5);
		int lastStr2 = sourceStr.lastIndexOf("ing", 5);

		System.out.println("ԭʼ�ַ���:" + sourceStr);
		System.out.println("�ַ�������:" + len);
		System.out.println("����16���ַ�:" + ch);
		System.out.println("��ǰ��������r�ַ�����һ���ҵ�����������:" + firstChar1);
		System.out.println("�Ӻ���ǰ����r�ַ�����һ���ҵ������ڵ�����:" + lastChar1);
		System.out.println("��ǰ��������ing�ַ�������һ���ҵ�����������:" + firstStr1);
		System.out.println("�Ӻ���ǰ����ing�ַ�������һ���ҵ�����������:" + lastStr1);
		System.out.println("������Ϊ15λ�ÿ�ʼ����ǰ��������e�ַ�����һ���ҵ�����������:" + firstChar2);
		System.out.println("������Ϊ15λ�ÿ�ʼ���Ӻ���ǰ����e�ַ�����һ���ҵ�����������:" + lastChar2);
		System.out.println("������Ϊ5λ�ÿ�ʼ����ǰ��������ing�ַ�������һ���ҵ�����������:" + firstStr2);
		System.out.println("������Ϊ5λ�ÿ�ʼ���Ӻ���ǰ����ing�ַ�������һ���ҵ�����������:" + lastStr2);

	}
}
