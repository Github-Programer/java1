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

		Student student1 = new Student("Tom", 18, "�廪��ѧ");
		Student student2 = new Student("Ben", 28, "������ѧ");
		Student student3 = new Student("Tony", 38, "��۴�ѧ");

		Worker worker1 = new Worker("Tom", 18, "�ֳ�");
		Worker worker2 = new Worker("Ben", 20, "�糧");

		Person[] people = { student1, student2, student3, worker1, worker2 };

		int studentCount = 0;
		int workerCount = 0;

		for (Person item : people) {
			if (item instanceof Worker) {
				workerCount++;
			} else if (item instanceof Student) {
				studentCount++;
			}
		}
		
		System.out.printf("����������%d��ѧ��������%d", workerCount, studentCount);
	}
}
