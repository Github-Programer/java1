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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {

		List list = new ArrayList();

		String b = "B";
		// �򼯺������Ԫ��
		list.add("A");
		list.add(b);
		list.add("C");
		list.add(b);
		list.add("D");
		list.add("E");

		// 1.ʹ��forѭ������
		System.out.println("--1.ʹ��forѭ������--");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("��ȡ����Ԫ��(%d): %s \n", i, list.get(i));
		}

		// 2.ʹ��for-eachѭ������
		System.out.println("--2.ʹ��for-eachѭ������--");
		for (Object item : list) {
			String s = (String) item;
			System.out.println("��ȡ����Ԫ��: " + s);
		}

		// 3.ʹ�õ���������
		System.out.println("--3.ʹ�õ���������--");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			String s = (String) item;
			System.out.println("��ȡ����Ԫ��: " + s);
		}
	}
}
