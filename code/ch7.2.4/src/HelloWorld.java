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

		// ��������ʼ��int����
		int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };

		System.out.println("----for-------");
		// for���
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Count is:" + numbers[i]);
		}

		System.out.println("----for each----");
		// for-each���
		for (int item : numbers) {
			System.out.println("Count is:" + item);
		}

	}
}
