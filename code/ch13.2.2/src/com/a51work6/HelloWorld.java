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

//HelloWorld.java�ļ�
import com.a51work6.imp.Ellipse;
import com.a51work6.imp.Triangle;

public class HelloWorld {

	public static void main(String[] args) {

		// f1�����Ǹ������ͣ�ָ������ʵ����������̬
		Figure f1 = new Triangle();
		f1.onDraw();
		System.out.println(f1.name);
		System.out.println(Figure.name);
		//f1.name = "Tony"; //�������

		// f2�����Ǹ������ͣ�ָ������ʵ����������̬
		Figure f2 = new Ellipse();
		f2.onDraw();
	}
}
