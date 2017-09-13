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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		Date date = readDate();
		System.out.println("��ȡ������  = " + date);
	}

	public static Date readDate() {

		FileInputStream readfile = null;
		InputStreamReader ir = null;
		BufferedReader in = null;
		try {
			readfile = new FileInputStream("readme.txt");
			ir = new InputStreamReader(readfile);
			in = new BufferedReader(ir);

			try {
				String str = in.readLine();
				if (str == null) {
					return null;
				}

				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Date date = df.parse(str);
				return date;
				
			} catch (ParseException e) {
				System.out.println("����ParseException...");
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			System.out.println("����FileNotFoundException...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����IOException...");
			e.printStackTrace();
		}
		return null;
	}

}
