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

		String sourceStr = "There is a string accessing example.";
		// ��ȡexample.���ַ���
		String subStr1 = sourceStr.substring(28);
		// ��ȡstring���ַ���
		String subStr2 = sourceStr.substring(11, 17);
		System.out.printf("subStr1 = %s%n", subStr1);
		System.out.printf("subStr2 = %s%n",subStr2);

		// ʹ��split�����ָ��ַ���
		System.out.println("-----ʹ��split����-----");
		String[] array = sourceStr.split(" ");
		for (String str : array) {
			System.out.println(str);
		}
	}
}
