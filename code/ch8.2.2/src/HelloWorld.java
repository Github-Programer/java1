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
		
		// ��̬��ʼ����ά����
		int[][] intArray = { 
				{ 1, 2, 3 }, 
				{ 11, 12, 13 }, 
				{ 21, 22, 23 },
				{ 31, 32, 33 } };

		// ��̬��ʼ����ά����
		double[][] doubleArray = new double[4][3];

		// ��������intArrayԪ�ص�ƽ������������浽doubleArray
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				// ����ƽ����
				doubleArray[i][j] = Math.sqrt(intArray[i][j]);
			}
		} 

		// ��ӡ����doubleArray
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				System.out.printf("[%d][%d] = %f", i, j, doubleArray[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}

	}
}
