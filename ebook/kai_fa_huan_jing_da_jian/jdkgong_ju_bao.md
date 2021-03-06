## 2.1 JDK工具包

JDK工具包是最基础的Java开发工具，很多Java IDE工具，如：Eclipse、IntelliJ IDEA和NetBeans等都依赖于JDK。也有一些人使用“JDK+文本编辑工具”编写Java程序。

### 2.1.1 JDK下载和安装

截止本书编写完成为止，Oracle公司对外发布的最新JDK 8。图2-1所示是JDK 8下载界面，它的下载地址是http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html。其中有很多版本，支持的操作系统有Linux、Mac OS X<sup><sup id="596144984728568-footnote-ref-3"><a href="#596144984728568-footnote-3">[3]</a></sup></sup>、Solaris<sup><sup id="596144984728568-footnote-ref-4"><a href="#596144984728568-footnote-4">[4]</a></sup></sup>和Windows。注意选择对应的操作系统，以及32位还是64位安装的文件。

如果你的电脑是Windows 10 64位系统， 则首先选中Accept License Agreement（同意许可协议），然后单击jdk-8u131-windows-x64.exe下载JDK文件。
![](../assets/2-1.jpg)
图2-1 下载JDK8

下载完成后就可以安装了，双击jdk-8u131-windows-x64.exe文件就可以安装了，安装过程中会弹出如图2-2所示的内容选择对话框，其中“开发工具”是JDK内容；“源代码”是安装Java SE源代码文件，如果安装源代码，安装完成后会见如图2-3所示的src.zip文件就是源代码文件；公共JRE就是Java运行环境了，这里可以不安装，因为JDK文件夹中也会有一个JRE，如图2-3所示的jre文件夹。
![](../assets/2-2.jpg)
图2-2 安装内容选择对话框
![](../assets/2-3.jpg)
图2-3 JDK安装后的内容

### 2.1.2 设置环境变量

完成之后，需要设置环境变量，主要包括：

1.  JAVA_HOME环境变量，指向JDK目录，很多Java工具运行都需要的JAVA_HOME环境变量，所以笔者推荐大家添加这变量。
2.  将JDK\bin目录添加到Path环境变量中，这样在任何路径下都可以执行JDK提供的工具指令。

首先需要打开Windows系统环境变量设置对话框，打开该对话框有很多方式，如果Windows 10系统，则打开步骤是：右击屏幕左下角的Windows图标![](../assets/2-Win.jpg)，单击“系统”菜单，然后弹出如图2-4所示的Windows系统对话框，单击右边的“高级系统设置”超连接，打开如图2-5所示的高级系统设置对话框。
![](../assets/2-4.jpg)
图2-4 Windows系统对话框
![](../assets/2-5.jpg)
图2-5 高级系统设置对话框

在如图2-5所示的高级系统设置对话框中，点击“环境变量”按钮打开环境变量设置对话框，如图2-6所示，可以在用户变量（上半部分，只配置当前用户）或系统变量（下半部分，配置所有用户）添加环境变量。一般情况下，在用户变量中设置环境变量。
![](../assets/2-6.jpg)
图2-6环境变量设置对话框

在用户变量部分单击“新建”按钮，系统弹出对话框，如图2-7所示。设置“变量名”设置为JAVA_HOME，“变量值”设置为JDK安装路径。最后单击“确定”按钮完成设置。

然后追加Path环境变量，在用户变量中找到Path，双击Path弹出Path变量对话框，如图2-8所示，追加%JAVA_HOME%\bin。注意多个变量路径之间用“;”（分号）分割。最后单击“确定”按钮完成设置。
![](../assets/2-7.jpg)
图2-7设置JAVA_HOME
![](../assets/2-8.jpg)
图2-8添加Path变量对话框

下面测试一下环境设置是否成功，可以通过在命令提示行中输入javac指令，看是否能够找到该指令，如图2-9所示，则说明环境设置成功。
![](../assets/2-9.jpg)
图2-9 通过命令提示行测试环境变量

#####提示 打开命令行工具，也可以通过右击屏幕左下角的Windows图标，单击“命令提示符”菜单实现。

[^3]: 苹果桌面操作系统，基于UNIX操作系统，现在改名为macOS。

[^4]: 原Sun公司UNIX操作系统，现在被Oracle公司收购。