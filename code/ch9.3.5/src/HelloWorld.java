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

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		// �Ƚ��ַ����Ƿ�����ͬ������
		System.out.println("s1 == s2 : " + (s1 == s2));
		// �Ƚ��ַ��������Ƿ����
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));

		String s3 = "HELlo";
		// ���Դ�Сд�Ƚ��ַ��������Ƿ����
		System.out.println("s1.equalsIgnoreCase(s3) : " + (s1.equalsIgnoreCase(s3)));

		// �Ƚϴ�С
		String s4 = "java";
		String s5 = "Swift";
		// �Ƚ��ַ�����С s4 > s5
		System.out.println("s4.compareTo(s5) : " + (s4.compareTo(s5)));
		// ���Դ�Сд�Ƚ��ַ�����С s4 < s5
		System.out.println("s4.compareToIgnoreCase(s5) : " + (s4.compareToIgnoreCase(s5)));

		// �ж��ļ������ļ���
		String[] docFolder = { "java.docx", " JavaBean.docx", "Objecitve-C.xlsx", "Swift.docx " };
		int wordDocCount = 0;
		// �����ļ�����Word�ĵ�����
		for (String doc : docFolder) {
			// ȥ��ǰ��ո�
			doc = doc.trim();
			// �ȽϺ�׺�Ƿ���.docx�ַ���
			if (doc.endsWith(".docx")) {
				wordDocCount++;
			}
		}
		System.out.println("�ļ�����Word�ĵ������ǣ� " + wordDocCount);

		int javaDocCount = 0;
		// �����ļ�����Java����ĵ�����
		for (String doc : docFolder) {
			// ȥ��ǰ��ո�
			doc = doc.trim();
			// ȫ���ַ�ת��Сд
			doc = doc.toLowerCase();
			// �Ƚ�ǰ׺�Ƿ���java�ַ���
			if (doc.startsWith("java")) {
				javaDocCount++;
			}
		}
		System.out.println("�ļ�����Java����ĵ������ǣ�" + javaDocCount);

	}
}
