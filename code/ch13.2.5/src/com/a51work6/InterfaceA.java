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

//InterfaceA.java�ļ�
package com.a51work6;

public interface InterfaceA {

	void methodA();

	String methodB();

	// Ĭ�Ϸ���
	default int methodC() {
		return 0;
	}

	// Ĭ�Ϸ���
	default String methodD() {
		return "����Ĭ�Ϸ���...";
	}

	// ��̬����
	static double methodE() {
		return 0.0;
	}
}