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
package com.a51work6;

public class HelloWorld {

	public static void main(String[] args) {

		Person p1 = new Student("Tom", 18, "�廪��ѧ");
		Person p2 = new Worker("Tom", 18, "�ֳ�");

		Person p3 = new Person("Tom", 28);
		Student p4 = new Student("Ben", 40, "�廪��ѧ");
		Worker p5 = new Worker("Tony", 28, "�ֳ�");

		// ����ת��
		Person p = (Person) p4;

		// ����ת��
		Student p11 = (Student) p1;
		Worker p12 = (Worker) p2;

		// Student p111 = (Student) p2;	//����ʱ�쳣
		if (p2 instanceof Student) {
			Student p111 = (Student) p2;
		}
		// Worker p121 = (Worker) p1;	//����ʱ�쳣
		if (p1 instanceof Worker) {
			Worker p121 = (Worker) p1;
		}
		// Student p131 = (Student) p3;	//����ʱ�쳣
		if (p3 instanceof Student) {
			Student p131 = (Student) p3;
		}

	}
}
