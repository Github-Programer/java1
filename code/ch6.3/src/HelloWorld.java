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

		int i = 0;
		int a = 10;
		int b = 9;

		if ((a > b) || (i == 1)) {
			System.out.println("������Ϊ ��");
		} else {
			System.out.println("������Ϊ ��");
		}

		if ((a < b) && (i == 1)) {
			System.out.println("������Ϊ ��");
		} else {
			System.out.println("������Ϊ ��");
		}

		if ((a > b) || (a++ == --b)) {
			System.out.printf("a = %s, b = %s", a, b);
		}
	}
}
