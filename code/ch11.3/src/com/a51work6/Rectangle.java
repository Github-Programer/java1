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

//Rectangle.java�ļ�
package com.a51work6;

// ������
public class Rectangle {

	// ���ο��
	int width;
	// ���θ߶�
	int height;
	// �������
	int area;

	// ���췽��
	public Rectangle(int w, int h) {
		width = w;
		height = h;
		area = getArea(w, h);
	}

	// ����������
	int getArea(int w, int h) {
		int a;
		a = w * h;
		return a;
	}

	// ���ƾ���
	public void drawRect() {
		System.out.printf("���� %d X %d ����", width, height);
	}
}
