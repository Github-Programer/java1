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

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(102, "����");
		map.put(105, "����");
		map.put(109, "����");
		map.put(110, "����");
		//"����"ֵ�ظ�
		map.put(111, "����");
		//109���Ѿ����ڣ��滻ԭ��ֵ"����"
		map.put(109, "����");

		// ��ӡ����Ԫ�ظ���
		System.out.println("����size = " + map.size());
		// ��ӡ����
		System.out.println(map);

		// ͨ����ȡֵ
		System.out.println("109 - " + map.get(109));
		System.out.println("108 - " + map.get(108));

		// ɾ����ֵ��
		map.remove(109);
		// �жϼ��������Ƿ����109
		System.out.println("���������Ƿ����109��" + map.containsKey(109));
		// �ж�ֵ�������Ƿ���� "����"
		System.out.println("ֵ�������Ƿ������" + map.containsValue("����"));

		// �жϼ����Ƿ�Ϊ��
		System.out.println("�����ǿյģ�" + map.isEmpty());

		// ��ռ���
		map.clear();
		System.out.println(map);
	}
}
