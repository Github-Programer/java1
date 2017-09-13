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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HelloWorld {

	// Web������ַ
	static String urlString = "http://www.51work6.com/service/mynotes/WebService.php?"
			+ "email=tonytest@51work6.com&type=JSON&action=query";

	public static void main(String[] args) {

		BufferedReader br = null;
		HttpURLConnection conn = null;

		try {
			URL reqURL = new URL(urlString);
			conn = (HttpURLConnection) reqURL.openConnection();
			// conn.setRequestMethod("GET");

			// ������ͨ��������
			InputStream is = conn.getInputStream();
			// ͨ��is����InputStreamReader����
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			// ͨ��isr����BufferedReader����
			br = new BufferedReader(isr);

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append('\n');
				line = br.readLine();
			}
			// ��־���
			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
