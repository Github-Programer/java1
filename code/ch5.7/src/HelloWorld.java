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

		////////// �Զ�����ת��//////////////
		// ������������
		byte byteNum = 16;
		short shortNum = 16;
		int intNum = 16;
		long longNum = 16L;

		// byte����ת��Ϊint����
		intNum = byteNum;
		// ����char����
		char charNum = '��';
		// char����ת��Ϊint����
		intNum = charNum;

		// �����������
		// long����ת��Ϊfloat����
		float floatNum = longNum;
		// float����ת��Ϊdouble����
		double doubleNum = floatNum;

		// ���ʽ�����������double
		double result = floatNum * intNum + doubleNum / shortNum;

		////////// ǿ������ת��//////////////
		//int�ͱ���
		int i = 10;
		//��int����iǿ��ת��Ϊbyte
		byte b = (byte) i; 
		int i2 = (int)i;
		int i3 = (int)b;
		
		//������ǿ������ת��
		float c1 = i / 3;
		System.out.println(c1);
		//��int����iǿ��ת��Ϊfloat
		float c2 = (float)i / 3;
		System.out.println(c2);
		
		//ǿ������ת�����¾��ȶ�ʧ
	    long yourNumber = 6666666666L;
	    System.out.println(yourNumber);
	    int myNuber = (int)yourNumber;
	    System.out.println(myNuber);
	    
	}
}
