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
		// ԭʼ���ɱ��ַ���
		String str1 = "Java C";
		// �Ӳ��ɱ���ַ������ɱ��ַ�������
		StringBuilder mstr = new StringBuilder(str1);

		// �����ַ���
		mstr.insert(4, " C++");
		System.out.println(mstr);

		// ����׷��Ч���Ĳ����ַ���
		mstr.insert(mstr.length(), " Objective-C");
		System.out.println(mstr);
		// ׷���ַ���
		mstr.append(" and Swift");
		System.out.println(mstr);

		// ɾ���ַ���
		mstr.delete(11, 23);
		System.out.println(mstr);

	}
}
