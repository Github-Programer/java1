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

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {

		int score = 80;
		String result = score > 60 ? "����" : "������"; // ��Ԫ�������? : ��
		System.out.println(result);
		
		Date date = new Date(); 	// new��������Դ���Date����
		System.out.println(date.toString());// ͨ��.��������÷���

	}
}
