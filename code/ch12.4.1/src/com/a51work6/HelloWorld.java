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
		
		// f1�����Ǹ������ͣ�ָ����ʵ��
		Figure f1 = new Figure();
		f1.onDraw();

		// f2�����Ǹ������ͣ�ָ������ʵ����������̬
		Figure f2 = new Triangle();
		f2.onDraw();

		// f3�����Ǹ������ͣ�ָ������ʵ����������̬
		Figure f3 = new Ellipse();
		f3.onDraw();

		// f4�������������ͣ�ָ������ʵ��
		Triangle f4 = new Triangle();
		f4.onDraw();

	}
}