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

public class HelloWorld {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = '\u0041';
		char c3 = '��';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//ת���
		//��Hello��World�����Ʊ��
		String specialCharTab1 = "Hello\tWorld.";
		//��Hello��World�����Ʊ�����Ʊ������Unicode����\u0009��ʾ
		String specialCharTab2 = "Hello\u0009World.";
		//��Hello��World���뻻�з�
		String specialCharNewLine = "Hello\nWorld.";
		//��Hello��World����س���
		String specialCharReturn = "Hello\rWorld.";
		//��Hello��World����˫����
		String specialCharQuotationMark = "Hello\"World\".";
		//��Hello��World���뵥����
		String specialCharApostrophe = "Hello\'World\'.";
		//��Hello��World���뷴б��
		String specialCharReverseSolidus = "Hello\\World.";
		
		System.out.println("ˮƽ�Ʊ��tab1: " + specialCharTab1);
		System.out.println("ˮƽ�Ʊ��tab2: " + specialCharTab2);
		System.out.println("����: " + specialCharNewLine);
		System.out.println("�س�: " + specialCharReturn);
		System.out.println("˫����: " + specialCharQuotationMark);
		System.out.println("������: " + specialCharApostrophe);
		System.out.println("��б��: " + specialCharReverseSolidus);		
		
	}
}
