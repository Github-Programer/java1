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

		// 1. if�ṹ
		int score = 95;
		if (score >= 85) {
			System.out.println("�������㣡");
		}
		if (score < 60) {
			System.out.println("����Ҫ�ӱ�Ŭ����");
		}
		if ((score >= 60) && (score < 85)) {
			System.out.println("���ĳɼ������ԣ��������Ŭ����");
		}

		// 2. if-else�ṹ
		if (score < 60) {
			System.out.println("������");
		} else {
			System.out.println("����");
		}

		// 3. else-if�ṹ
		int testScore = 76;
		char grade;
		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);

	}
}
