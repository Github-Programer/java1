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

// MethodOverloading.java�ļ�
package com.a51work6;

class MethodOverloading {

	void receive(int i) {
		System.out.println("����һ��int����");
		System.out.println("i = " + i);
	}

	void receive(int x, int y) {
		System.out.println("��������int����");
		System.out.printf("x = %d, y = %d \r", x, y);
		return;
	}
	
	int receive(double x, double y) {
		System.out.println("��������double����");
		System.out.printf("x = %f, y = %f \r", x, y);
		return 0;
	}
}
