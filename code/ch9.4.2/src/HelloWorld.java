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

		//����ַ������ַ�
		StringBuilder sbuilder1 = new StringBuilder("Hello");
		sbuilder1.append(" ").append("World");
		sbuilder1.append('.');
		System.out.println(sbuilder1);
		
		StringBuilder sbuilder2 = new StringBuilder();
		Object obj = null;
		//��Ӳ���ֵ��ת����Ϳն���
		sbuilder2.append(false).append('\t').append(obj);
		System.out.println(sbuilder2);

		//�����ֵ
		StringBuilder sbuilder3 = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sbuilder3.append(i);
		} 
		System.out.println(sbuilder3);
	}
}
