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

//Worker.java�ļ�
package com.a51work6;

public class Worker extends Person {

	String factory;

	public Worker(String name, int age, String factory) {
		super(name, age);
		this.factory = factory;
	}

	@Override
	public String toString() {
		return "Worker [factory=" + factory 
				+ ", name=" + name 
				+ ", age=" + age + "]";
	}
}
