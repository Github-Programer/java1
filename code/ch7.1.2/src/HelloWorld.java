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
		
		int testScore = 75;
		
		char grade;
		switch (testScore / 10) {
		case 9:
			grade = '��';
			break;
		case 8:
			grade = '��';
			break;
		case 7: //7�ǹ�ͨ��
		case 6:
			grade = '��';
			break;
		default:
			grade = '��';
		}
		System.out.println("Grade = " + grade);

	}
}
