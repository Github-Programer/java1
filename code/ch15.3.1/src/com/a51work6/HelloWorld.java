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

		// ��ӡ����Ԫ�ظ���
		System.out.println("����size = " + set.size());
		// ��ӡ����
		System.out.println(set);

		// ɾ�������е�һ��"B"Ԫ��
		set.remove(b);
		// �жϼ������Ƿ����"B"Ԫ��
		System.out.println("�Ƿ����\"B\"��" + set.contains(b));
		// �жϼ����Ƿ�Ϊ��
		System.out.println("set�����ǿյģ�" + set.isEmpty());

		// ��ռ���
		set.clear();
		System.out.println(set);
	}
}
