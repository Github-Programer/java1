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

		System.out.println("---------");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d", i, i, i * i);
			// ��ӡһ�����з���ʵ�ֻ���
			System.out.println();
		}

		System.out.println("---------");
		
		int x;
		int y;

		for (x = 0, y = 10; x < y; x++, y--) {
			System.out.printf("(x,y) = (%d, %d)", x, y);
			// ��ӡһ�����з���ʵ�ֻ���
			System.out.println();
		}

	}
}
