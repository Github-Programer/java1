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

//Downloader.java�ļ�
package com.a51work6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader {

	// Web������ַ
	private static String urlString = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/"
			+ "static/superman/img/logo/bd_logo1_31bdc765.png";

	public static void main(String[] args) {
		download();
	}

	// ���ط���
	private static void download() {

		HttpURLConnection conn = null;

		try {
			// ����URL����
			URL reqURL = new URL(urlString);
			// ������
			conn = (HttpURLConnection) reqURL.openConnection();

			try (// �����Ӷ�����������
					InputStream is = conn.getInputStream();
					BufferedInputStream bin = new BufferedInputStream(is);
					// �����ļ������
					OutputStream os = new FileOutputStream("./download.png");
					BufferedOutputStream bout = new BufferedOutputStream(os);) {

				byte[] buffer = new byte[1024];
				int bytesRead = bin.read(buffer);
				while (bytesRead != -1) {
					bout.write(buffer, 0, bytesRead);
					bytesRead = bin.read(buffer);
				}
			} catch (IOException e) {
			}
			System.out.println("������ɡ�");
		} catch (IOException e) {
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}
}
