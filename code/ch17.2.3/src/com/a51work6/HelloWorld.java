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
package com.a51work6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("-------1. JSON�������----------");
		// 1. JSON�������
		// {"name": "tony", "age": 30, "a": [1, 3]}
		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", "tony");
			jsonObject.put("age", 30);

			JSONArray jsonArray = new JSONArray();
			jsonArray.put(1).put(3);
			jsonObject.put("a", jsonArray);

			// �������
			System.out.println(jsonObject.toString());

		} catch (JSONException e) {
			e.printStackTrace();
		}

		System.out.println("-------2. JSON�������----------");
		// 2. JSON�������
		// {"name":"tony", "age":30, "a":[1, 3]}
		// JSON�ַ���
		String jsonString = "{\"name\":\"tony\", \"age\":30, \"a\":[1, 3]}";

		try {
			JSONObject jsonObject = new JSONObject(jsonString);

			String name = jsonObject.getString("name");
			System.out.println("name : " + name);
			int age = jsonObject.getInt("age");
			System.out.println("age : " + age);

			JSONArray jsonArray = jsonObject.getJSONArray("a");
			int n1 = jsonArray.getInt(0);
			System.out.println("����a��һ��Ԫ�� : " + n1);
			int n2 = jsonArray.getInt(1);
			System.out.println("����a�ڶ���Ԫ�� : " + n2);

		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
