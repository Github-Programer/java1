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

		//-----------------------------------
		// �ַ�������length���ַ�������������capacity
		StringBuilder sbuilder1 = new StringBuilder();
		System.out.println("�������ַ������ȣ�" + sbuilder1.length());
		System.out.println("�ַ���������������" + sbuilder1.capacity());

		StringBuilder sbuilder2 = new StringBuilder("Hello");
		System.out.println("�������ַ������ȣ�" + sbuilder2.length());
		System.out.println("�ַ���������������" + sbuilder2.capacity());

		// �ַ�����������ʼ������16������֮�������
		StringBuilder sbuilder3 = new StringBuilder();
		for (int i = 0; i < 17; i++) {
			sbuilder3.append(8);
		}
		System.out.println("�������ַ������ȣ�" + sbuilder3.length());
		System.out.println("�ַ���������������" + sbuilder3.capacity());
		
	}
}
