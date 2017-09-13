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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyWithBuffer {

	public static void main(String[] args) {

		try (FileReader fis = new FileReader("./TestDir/JButton.html");
				BufferedReader bis = new BufferedReader(fis);
				FileWriter fos = new FileWriter("./TestDir/subDir/JButton.html");
				BufferedWriter bos = new BufferedWriter(fos)) {

			// ���ȶ�ȡһ���ı�
			String line = bis.readLine();
			
			while (line != null) {
				// ��ʼд������
				bos.write(line);
				//дһ�����з�
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
