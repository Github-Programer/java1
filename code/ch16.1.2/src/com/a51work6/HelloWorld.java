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

import java.io.File;
import java.io.FilenameFilter;

public class HelloWorld {

	public static void main(String[] args) {

		// ��File�����ʾһ��Ŀ¼,.��ʾ��ǰĿ¼
		File dir = new File("./TestDir");//TestDir
		// ����HTML�ļ�������
		Filter filter = new Filter("html");

		System.out.println("HTML�ļ�Ŀ¼��" + dir);
		// �г�Ŀ¼TestDir�£��ļ���׺��ΪHTML�������ļ�
		String files[] = dir.list(filter); //dir.list();
		// �����ļ��б�
		for (String fileName : files) {
			// ΪĿ¼TestDir�µ��ļ���Ŀ¼����File����
			File f = new File(dir, fileName);
			// �����f�������ļ������ӡ�ļ���
			if (f.isFile()) {
				System.out.println("�ļ�����" + f.getName());
				System.out.println("�ļ�����·����" + f.getAbsolutePath());
				System.out.println("�ļ�·����" + f.getPath());
			} else {
				System.out.println("��Ŀ¼��" + f);
			}
		}

	}
}

// �Զ�������ļ���չ�����ļ�������
class Filter implements FilenameFilter {

	// �ļ���չ��
	String extent;

	// ���췽��
	Filter(String extent) {
		this.extent = extent;
	}

	@Override
	public boolean accept(File dir, String name) {
		// �����ļ���չ���Ƿ�Ϊextent��ָ����
		return name.endsWith("." + extent);
	}
}
