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

/*
 * ����ʵ������ϲ�
 */
public class HelloWorld {

	public static void main(String[] args) {
		// �������ϲ�����
		int array1[] = { 20, 10, 50, 40, 30 };
		int array2[] = { 1, 2, 3 };

		// ��̬��ʼ�����飬��������ĳ�����array1��array2����֮��
		int array[] = new int[array1.length + array2.length];

		// ѭ�������������
		for (int i = 0; i < array.length; i++) {

			if (i < array1.length) {
				array[i] = array1[i];
			} else {
				array[i] = array2[i - array1.length];
			}
		}

		System.out.println("�ϲ���:");
		for (int element : array) {
			System.out.printf("%d ", element);
		}
	}
}
