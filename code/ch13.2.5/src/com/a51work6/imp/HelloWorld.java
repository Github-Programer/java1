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
package com.a51work6.imp;

import com.a51work6.InterfaceA;

public class HelloWorld {

	public static void main(String[] args) {

		//�����ӿ����ͣ�������ʵ���࣬������̬
		InterfaceA abc = new ABC();

		// ����ʵ����methodB����
		System.out.println(abc.methodB());

		// ����Ĭ�Ϸ���methodC
		System.out.println(abc.methodC());

		// ����Ĭ�Ϸ���methodD
		System.out.println(abc.methodD());

		// ����InterfaceA��̬����methodE
		System.out.println(InterfaceA.methodE());
	}
}
