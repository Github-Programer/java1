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
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {

		List list = new ArrayList();

		String b = "B";
		
		//�򼯺������Ԫ��
		list.add("A");
		list.add(b);
		list.add("C");
		list.add(b);
		list.add("D");
		list.add("E");
		
		//��ӡ����Ԫ�ظ���
		System.out.println("����size = " + list.size());
		//��ӡ����
		System.out.println(list);
		
		//��ǰ������Ҽ����е�"B"Ԫ��
		System.out.println("indexOf(\"B\") = " + list.indexOf(b));
		//�Ӻ���ǰ���Ҽ����е�"B"Ԫ��
		System.out.println("lastIndexOf(\"B\") = " + list.lastIndexOf(b));
		
		//ɾ�������е�һ��"B"Ԫ��
		list.remove(b);		
		System.out.println("remove(3)ǰ�� " + list);
		//�жϼ������Ƿ����"B"Ԫ��
		System.out.println("�Ƿ����\"B\"��" + list.contains(b));	
		
		//ɾ�����ϵ�4��Ԫ��
		list.remove(3);
		System.out.println("remove(3)�� " + list);
		//�жϼ����Ƿ�Ϊ��
		System.out.println("list�����ǿյģ�" + list.isEmpty());

		System.out.println("�滻ǰ��" + list);
		//�滻���ϵ�2��Ԫ��
		list.set(1, "F");
		System.out.println("�滻��" + list);
		
		//��ռ���
		list.clear();
		System.out.println(list);
		
		// �������Ԫ��
		list.add(1);//�����Զ�װ��
		list.add(3);
		
		int item = (Integer)list.get(0);//�����Զ�����
	}
}
