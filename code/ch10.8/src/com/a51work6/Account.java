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

// Account.java�ļ�
package com.a51work6;

public class Account {

	// ʵ�������˻����
	double amount = 0.0;
	// ʵ�������˻���
	String owner;

	// ��̬��������
	static double interestRate;

	// ��̬����
	public static double interestBy(double amt) {
		// ��̬�������Է��ʾ�̬������������̬����
		return interestRate * amt;
	}

	// ��̬�����
	static {
		System.out.println("��̬����鱻����...");
		// ��ʼ����̬����
		interestRate = 0.0668;
	}
}
