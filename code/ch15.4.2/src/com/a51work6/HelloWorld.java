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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(102, "����");
		map.put(105, "����");
		map.put(109, "����");
		map.put(110, "����");
		map.put(111, "����");

		// 1.ʹ��for-eachѭ������
		System.out.println("--1.ʹ��for-eachѭ������--");
		// ��ü�����
		Set keys = map.keySet();
		for (Object key : keys) {
			int ikey = (Integer) key; // �Զ�����
			String value = (String) map.get(ikey); // �Զ�װ��
			System.out.printf("key=%d - value=%s \n", ikey, value);
		}

		// 2.ʹ�õ���������
		System.out.println("--2.ʹ�õ���������--");
		// ���ֵ����
		Collection values = map.values();
		// ����ֵ����
		Iterator it = values.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			String s = (String) item;
			System.out.println("ֵ����Ԫ��: " + s);
		}
	}
}
