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

package com.a51work6;

public class Animal {// extends Object {

	// ����

	// ��������
	int age = 1;
	// �����Ա�
	public boolean sex = false;
	// ��������
	private double weight = 0.0;

	public void eat() {
		// ������
		return; // ����ʡ��
	}

	int run() {
		// ������
		return 10;
	}

	protected int getMaxNumber(int number1, int number2) {
		// ������
		if (number1 > number2) {
			return number1;
		}
		return number2;
	}

}
