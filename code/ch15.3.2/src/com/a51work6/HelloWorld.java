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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) {

		Set set = new HashSet();

		String b = "B";
		// �򼯺������Ԫ��
		set.add("A");
		set.add(b);
		set.add("C");
		set.add(b);
		set.add("D");
		set.add("E");

		// 1.ʹ��for-eachѭ������
		System.out.println("--1.ʹ��for-eachѭ������--");
		for (Object item : set) {
			String s = (String) item;
			System.out.println("��ȡ����Ԫ��: " + s);
		}

		// 2.ʹ�õ���������
		System.out.println("--2.ʹ�õ���������--");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			String s = (String) item;
			System.out.println("��ȡ����Ԫ��: " + s);
		}
	}
}
