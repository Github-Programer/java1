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

//Person.java�ļ�
package com.a51work6;

import java.util.Date;

public class Person {

	// ����
	private String name;
	// ����
	private int age;
	// ��������
	private Date birthDate;

	// ���м�������
	public Person(String n, int a, Date d) {
		name = n;
		age = a;
		birthDate = d;
	}

	// Ĭ�ϼ�������
	Person(String n, int a) {
		name = n;
		age = a;
	}

	// ������������
	protected Person(String n, Date d) {
		name = n;
		age = 30;
		birthDate = d;
	}

	// ˽�м�������
	private Person(String n) {
		name = n;
		age = 30;
	}

	public String getInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("����: ").append(name).append('\n');
		sb.append("����: ").append(age).append('\n');
		sb.append("��������: ").append(birthDate).append('\n');
		return sb.toString();
	}
}
