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

//HelloWorld.java�ļ�
package com.a51work6;

public class HelloWorld {

	public static void main(String[] args) {

		int a = 0;
		int result = divide(5, a);
		System.out.printf("divide(%d, %d) = %d", 5, a, result);
	}

	public static int divide(int number, int divisor) {

		try {
			return number / divisor;
		} catch (Throwable throwable) {

			System.out.println("getMessage() : " + throwable.getMessage());

			System.out.println("toString() : " + throwable.toString());

			System.out.println("printStackTrace()�����Ϣ���£�");
			throwable.printStackTrace();
		}

		return 0;
	}

}
