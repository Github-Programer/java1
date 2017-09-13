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

	// �����������췽��
	public Person(String name, int age, Date d) {
		this.name = name;
		this.age = age;
		birthDate = d;
		System.out.println(this.toString());
	}

	public Person(String name, int age) {
		// ���������������췽��
		this(name, age, null);
	}

	public Person(String name, Date d) {
		// ���������������췽��
		this(name, 30, d);
	}

	public Person(String name) {
		// System.out.println(this.toString());
		// ����Person(String name, Date d)���췽��
		this(name, null);
	}

	@Override
	public String toString() {
		return "Person [name=" + name 
				+ ", age=" + age 
				+ ", birthDate=" + birthDate + "]";
	}

}
