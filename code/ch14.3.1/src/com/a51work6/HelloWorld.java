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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		Date date = readDate();
		System.out.println("����  = " + date);
	}

	// ��������
	public static Date readDate() {

		try {
			String str = "2018-18-18"; //"201A-18-18"
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			// ���ַ����н�������
			Date date = df.parse(str);
			return date;
		} catch (ParseException e) {
			System.out.println("����ParseException...");
			e.printStackTrace();
		}
		return null;
	}
}
