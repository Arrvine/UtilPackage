# UtilPackage
这包含了一些日常进行Java编程时自己编写的小工具
分别有XML文件解析、Properties文件解析、包扫描工具、swing界面编程简易框架、还有类型转换工具

XMLParser.java:XML文件解析<br>
PropertiesParser.java:Properties文件解析<br>
PackageScanner.java:包扫描，该工具不仅可以扫描普通包还可以扫描jar包<br>
IView.java是一个简易框架，定义了字体，标题颜色，showView和exitView两个方法,其余方法需要使用者自行实现<br>
ViewTool.java，界面弹出框，编写了四个方法，宣告、警告、错误、选择<br>
StringToType.java：是一个可以把字符串表示的类型转换为真正的类型，例如：“byte”(String类型)->byte(byte类型)<br>
ArgumentMaker.java:是一个使用Gson对字符串与json类型互相转换的工具


