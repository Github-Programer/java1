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

		int intArray[][] = new int[4][]; //�ȳ�ʼ����ά����Ϊ4
		//��һ��ʼ����ά����
		intArray[0] = new int[2]; 
		intArray[1] = new int[1];
		intArray[2] = new int[3];
		intArray[3] = new int[3];
		
		//forѭ������
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = i + j;
			}
		} 
		//for-eachѭ������
		for (int[] row : intArray) {
			for (int column : row) {				
				System.out.print(column);
				//��Ԫ��֮������Ʊ����
				System.out.print('\t');
			}
			//һ��Ԫ�ش�ӡ��ɺ���
			System.out.println();
		} 
		
		//System.out.println(intArray[0][2]); //���������ڴ���		
	}
}
