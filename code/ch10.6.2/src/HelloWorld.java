/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线课堂：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* Java读者服务QQ群：547370999
* 【配套电子书】网址：
*       图灵社区：
*       http://www.ituring.com.cn/book/2480
*       百度阅读：
*       https://yuedu.baidu.com/ebook/7c1499987e192279168884868762caaedd33ba00 
*/

// 默认包中HelloWorld.java文件
import com.a51work6.DefaultClass;

public class HelloWorld {

	public static void main(String[] args) {

		DefaultClass p;
		p = new DefaultClass();
		// 编译错误，DefaultClass中的方法 printX()不可见
		p.printX();
	}
}
