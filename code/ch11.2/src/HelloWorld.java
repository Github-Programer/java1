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
public class HelloWorld {

	public static void main(String[] args) {

		String name = null;
		//���null�ַ���
		System.out.println(name);
		//�ж϶����Ƿ�Ϊnull
		if (name != null) {
			int len = name.length();
		}

		name = new String("Hello World");
		System.out.println(name);

	}
}
