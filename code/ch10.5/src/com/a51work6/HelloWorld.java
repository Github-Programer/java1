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

// HelloWorld.java�ļ�
package com.a51work6;

public class HelloWorld {

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		//����void receive(int i)
		mo.receive(1);
		
		//����void receive(int x, int y)
		mo.receive(2, 3);
		
		//����void receive(double x, double y)
		mo.receive(2.0, 3.3);		
	}
}
