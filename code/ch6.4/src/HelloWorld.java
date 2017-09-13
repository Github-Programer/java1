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

		byte a = 0B00110010;	//ʮ����50
		byte b = 0B01011110;	//ʮ����94

		System.out.println("a | b = " + (a | b)); 	// 0B01111110
		System.out.println("a & b = " + (a & b)); 	// 0B00010010
		System.out.println("a ^ b = " + (a ^ b)); 	// 0B01101100
		System.out.println("~b = " + (~b)); 		// 0B10100001

		System.out.println("a >> 2 = " + (a >> 2)); 	// 0B00001100
		System.out.println("a >> 1 = " + (a >> 1)); 	// 0B00011001
		System.out.println("a >>> 2 = " + (a >>> 2)); 	// 0B00001100
		System.out.println("a << 2 = " + (a << 2)); 	// 0B11001000
		System.out.println("a << 1 = " + (a << 1)); 	// 0B01100100

		int c = -12;
		System.out.println("c >>> 2 = " + (c >>> 2));
		System.out.println("c >> 2 = " + (c >> 2));

	}
}
