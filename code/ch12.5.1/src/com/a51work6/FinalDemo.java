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

//FinalDemo.java�ļ�
package com.a51work6;

class FinalDemo {

	void doSomething() {
		// û����������ͬʱ��ֵ
		final int e;
		// ֻ�ܸ�ֵһ��
		e = 100;
		System.out.print(e);
		// ������ͬʱ��ֵ
		final int f = 200;
	}

	// ʵ������
	final int a = 5; // ֱ�Ӹ�ֵ
	final int b; // �հ�final����

	// ��̬����
	final static int c = 12;// ֱ�Ӹ�ֵ
	final static int d; // �հ�final����

	// ��̬�����
	static {
		// ��ʼ����̬����
		d = 32;
	}

	// ���췽��
	FinalDemo() {
		// ��ʼ��ʵ������
		b = 3;
		// �ڶ��θ�ֵ���ᷢ���������
		// b = 4;
	}
}