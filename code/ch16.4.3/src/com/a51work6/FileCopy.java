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

//FileCopy.java�ļ�
package com.a51work6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("./TestDir/build.txt");
				FileWriter out = new FileWriter("./TestDir/subDir/build.txt")) {

			// ׼��һ��������
			char[] buffer = new char[10];
			// ���ȶ�ȡһ��
			int len = in.read(buffer);

			while (len != -1) {
				String copyStr = new String(buffer);
				// ��ӡ���Ƶ��ַ���
				System.out.println(copyStr);
				// ��ʼд������
				out.write(buffer, 0, len);
				// �ٶ�ȡһ��
				len = in.read(buffer);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
