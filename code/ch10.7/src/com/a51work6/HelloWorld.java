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

// HelloWorld.java�ļ�
package com.a51work6;

public class HelloWorld {

	public static void main(String[] args) {
		// ���ʾ�̬����
		System.out.println(Account.interestRate);
		// ���ʾ�̬����
		System.out.println(Account.interestBy(1000));

		Account myAccount = new Account();
		// ����ʵ������
		myAccount.amount = 1000000;
		myAccount.owner = "Tony";
		// ����ʵ������
		System.out.println(myAccount.messageWith(1000));

		// ͨ��ʵ�����ʾ�̬����
		System.out.println(myAccount.interestRate);
	}
}
