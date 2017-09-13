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

//FileCopyWithBuffer.java�ļ�
package com.a51work6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopyWithBuffer {

	public static void main(String[] args) {

		try ( // �����ֽ��ļ�����������
				FileInputStream fis = new FileInputStream("./TestDir/JButton.html");
				// ����ת��������
				InputStreamReader isr = new InputStreamReader(fis);
				// �����ַ���������������
				BufferedReader bis = new BufferedReader(isr);

				// �����ֽ��ļ����������
				FileOutputStream fos = new FileOutputStream("./TestDir/subDir/JButton.html");
				// ����ת��������
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				// �����ַ��������������
				BufferedWriter bos = new BufferedWriter(osw)) {

			// ���ȶ�ȡһ���ı�
			String line = bis.readLine();

			while (line != null) {
				// ��ʼд������
				bos.write(line);
				// дһ�����з�
				bos.newLine();
				// �ٶ�ȡһ���ı�
				line = bis.readLine();
			}
			System.out.println("�������");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
