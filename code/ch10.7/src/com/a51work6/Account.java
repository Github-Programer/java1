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
	static double interestRate = 0.0668;

	// ��̬����
	public static double interestBy(double amt) {
		//��̬�������Է��ʾ�̬������������̬����
		return interestRate * amt;
	}

	// ʵ������
	public String messageWith(double amt) {
		//ʵ���������Է���ʵ��������ʵ����������̬�����;�̬����
		double interest = Account.interestBy(amt);
		StringBuilder sb = new StringBuilder();
		// ƴ���ַ���
		sb.append(owner).append("����Ϣ��").append(interest);
		// �����ַ���
		return sb.toString();
	}

}
