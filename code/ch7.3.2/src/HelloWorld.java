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

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < numbers.length; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("Count is: " + i);
		}

		label1: for (int x = 0; x < 5; x++) {
			for (int y = 5; y > 0; y--) {
				if (y == x) {
					continue label1;
				}
				System.out.printf("(x,y) = (%d,%d)", x, y);
				System.out.println();
			}
		}
		System.out.println("Game Over!");
	}
}
