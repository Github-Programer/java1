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

//ParentClass.java�ļ�
package com.a51work6;

class ParentClass {
	// x��Ա����
	int x;

	protected void setValue() {
		x = 10;
	}
}

class SubClass extends ParentClass {
	// ���θ���x��Ա����
	int x;

	@Override
	public void setValue() { // ���Ǹ��෽��
		// �����������x��Ա����
		x = 20;
		// ���ø���setValue()����
		super.setValue();
	}

	public void print() {
		// �����������x��Ա����
		System.out.println("x = " + x);
		// ���ʸ���x��Ա����
		System.out.println("super.x = " + super.x);
	}
}
