## 关注 JeeSite 4.0 请移步: <https://gitee.com/thinkgem/jeesite4>

# JeeSite 企业信息化快速开发平台

## 平台简介

JeeSite是基于多个优秀的开源项目，高度整合封装而成的高效，高性能，强安全性的**开源**Java EE快速开发平台。

JeeSite是您快速完成项目的最佳基础平台解决方案，JeeSite是您想学习Java平台的最佳学习案例，JeeSite还是接私活的最佳助手。

JeeSite是在Spring Framework基础上搭建的一个Java基础开发平台，以Spring MVC为模型视图控制器，MyBatis为数据访问层，
Apache Shiro为权限授权层，Ehcahe对常用数据进行缓存，Activit为工作流引擎。是JavaEE界的最佳整合。

JeeSite主要定位于企业信息化领域，已内置企业信息化系统的基础功能和高效的**代码生成**工具，
包括：系统权限组件、数据权限组件、数据字典组件、核心工具组件、视图操作组件、工作流组件、代码生成等。
前端界面风格采用了结构简单、性能优良、页面美观大气的Twitter Bootstrap页面展示框架。
采用分层设计、双重验证、提交数据安全编码、密码加密、访问验证、数据权限验证。
使用Maven做项目管理，提高项目的易开发性、扩展性。

JeeSite目前包括以下四大模块，系统管理（SYS）模块、
内容管理（CMS）模块、在线办公（OA）模块、代码生成（GEN）模块。 **系统管理模块** ，包括企业组织架构（用户管理、机构管理、区域管理）、
菜单管理、角色权限管理、字典管理等功能； **内容管理模块** ，包括内容管理（文章、链接），栏目管理、站点管理、
公共留言、文件管理、前端网站展示等功能； **在线办公模块** ，提供简单的请假流程实例；**代码生成模块** ，完成重复的工作。

JeeSite 提供了常用工具进行封装，包括日志工具、缓存工具、服务器端验证、数据字典、当前组织机构数据
（用户、机构、区域）以及其它常用小工具等。另外还提供一个强大的在线 **代码生成** 工具，
此工具提供简单的单表、一对多、树结构功能的生成，如果对外观要求不是很高，生成的功能就可以用了。
如果你使用了JeeSite基础框架，就可以很高效的快速开发出，优秀的信息管理系统。

## 内置功能

1.	用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.	机构管理：配置系统组织机构（公司、部门、小组），树结构展现，可随意调整上下级。
3.	区域管理：系统城市区域模型，如：国家、省市、地市、区县的维护。
4.	菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.	角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.	字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等。
7.	操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
8.	连接池监视：监视当期系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。
9.	工作流引擎：实现业务工单流转、在线流程设计器。

## 为何选择JeeSite

1. 使用 [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) 协议，源代码完全开源，无商业限制。
2. 使用目前主流的Java EE开发框架，简单易学，学习成本低。
3. 数据库无限制，目前支持MySql、Oracle，可扩充SQL Server、PostgreSQL、H2等。
4. 模块化设计，层次结构清晰。内置一系列企业信息管理的基础功能。
5. 操作权限控制精密细致，对所有管理链接都进行权限验证，可控制到按钮。
6. 数据权限控制精密细致，对指定数据集权限进行过滤，七种数据权限可供选择。
7. 提供在线功能代码生成工具，提高开发效率及质量。
8. 提供常用工具类封装，日志、缓存、验证、字典、组织机构等，常用标签（taglib），获取当前组织机构、字典等数据。
9. 兼容目前最流行浏览器（IE7+、Chrome、Firefox）IE6也支持，但体验效果差。

## 技术选型

1、后端

* 核心框架：Spring Framework 4.1
* 安全框架：Apache Shiro 1.2
* 视图框架：Spring MVC 4.1
* 服务端验证：Hibernate Validator 5.2
* 布局框架：SiteMesh 2.4
* 工作流引擎：Activiti 5.21
* 任务调度：Spring Task 4.1
* 持久层框架：MyBatis 3.2
* 数据库连接池：Alibaba Druid 1.0
* 缓存框架：Ehcache 2.6、Redis
* 日志管理：SLF4J 1.7、Log4j
* 工具类：Apache Commons、Jackson 2.2、Xstream 1.4、Dozer 5.3、POI 3.9
* 短信网关：<http://www.lehuo520.cn> **乐云短信** SmsLeyunUtils.java

2、前端

* JS框架：jQuery 1.9。
* CSS框架：Twitter Bootstrap 2.3.1（稳定是后台，UI方面根据需求自己升级改造吧）。
* 客户端验证：JQuery Validation Plugin 1.11。
* 富文本在线编辑：CKEditor
* 在线文件管理：CKFinder
* 动态页签：Jerichotab
* 手机端框架：Jingle
* 数据表格：jqGrid
* 对话框：jQuery jBox
* 下拉选择框：jQuery Select2
* 树结构控件：jQuery zTree
* 日期控件： My97DatePicker

4、平台

* 服务器中间件：在Java EE 5规范（Servlet 2.5、JSP 2.1）下开发，支持应用服务器中间件
有Tomcat 6+、Jboss 7+、WebLogic 10+、WebSphere 8+。
* 数据库支持：目前仅提供MySql和Oracle数据库的支持，但不限于数据库，平台留有其它数据库支持接口，
你可以很方便的更改为其它数据库，如：SqlServer 2008、MySql 5.5、H2等
* 开发环境：Java、Eclipse Java EE 4.3、Maven 3.1、Git

## 安全考虑

1. 开发语言：系统采用Java 语言开发，具有卓越的通用性、高效性、平台移植性和安全性。
2. 分层设计：（数据库层，数据访问层，业务逻辑层，展示层）层次清楚，低耦合，各层必须通过接口才能接入并进行参数校验（如：在展示层不可直接操作数据库），保证数据操作的安全。
3. 双重验证：用户表单提交双验证：包括服务器端验证及客户端验证，防止用户通过浏览器恶意修改（如不可写文本域、隐藏变量篡改、上传非法文件等），跳过客户端验证操作数据库。
4. 安全编码：用户表单提交所有数据，在服务器端都进行安全编码，防止用户提交非法脚本及SQL注入获取敏感数据等，确保数据安全。
5. 密码加密：登录用户密码进行SHA1散列加密，此加密方法是不可逆的。保证密文泄露后的安全问题。
6. 强制访问：系统对所有管理端链接都进行用户身份权限验证，防止用户直接填写url进行访问。

## 快速体验

1. 具备运行环境：JDK1.6+、Maven3.0+、MySql5+或Oracle10g+。
2. 修改src\main\resources\jeesite.properties文件中的数据库设置参数。
3. 根据修改参数创建对应MySql或Oracle数据库用户和参数。
4. 运行bin\init-db.bat脚本，即可导入表结构及演示数据(linux操作系统：在控制台中切换至项目根目录，运行命令：mvn antrun:run -Pinit-db)
5. 运行bin\run-tomcat7.bat或bin\run-jetty.bat，启动Web服务器（第一次运行，需要下载依赖jar包，请耐心等待）。
6. 最高管理员账号，用户名：thinkgem 密码：admin

## 常见问题

1. 用一段时间提示内存溢出，请修改JVM参数：-Xmx512m -XX:MaxPermSize=256m
2. 有时出现文字乱码：修改Tomcat的server.xml文件的Connector项，增加URIEncoding="UTF-8"
3. 为什么新建菜单后看不到新建的菜单？因为授权问题，菜单管理只允许最高管理员账号管理（最高管理员默认账号：thinkgem 密码：admin）。

## 更多文档

* <https://github.com/thinkgem/jeesite/tree/master/doc>

## 如何交流、反馈、参与贡献？

* QQ Group：`127515876(已满)` `209330483(已满)` `223507718(已满)` `709534275` `730390092`
* E-mail：thinkgem@163.com
* GitHub：<https://github.com/thinkgem/jeesite>
* 开源中国：<http://git.oschina.net/thinkgem/jeesite>
* 官方网址：<http://jeesite.com>  论坛：<http://bbs.jeesite.com>
* 支持JeeSite发展：（加我好友）支付宝：thinkgem@163.com &nbsp; 微信：thinkgem

一个人的个人能力再强，也无法战胜一个团队，希望兄弟姐妹的支持，能够贡献出自己的部分代码，参与进来共同完善它(^_^)。

怎么共享我的代码：[手把手教你如何加入到github的开源世界！](http://www.cnblogs.com/wenber/p/3630921.html)

## 版权声明

本软件使用 [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) 协议，请严格遵照协议内容：

1. 需要给代码的用户一份Apache Licence。
2. 如果你修改了代码，需要在被修改的文件中说明。
3. **在延伸的代码中（修改和有源代码衍生的代码中）需要带有原来代码中的协议，商标，专利声明和其他原来作者规定需要包含的说明。**
4. 如果再发布的产品中包含一个Notice文件，则在Notice文件中需要带有Apache Licence。你可以在Notice中增加自己的许可，但不可以表现为对Apache Licence构成更改。
5. Apache Licence也是对商业应用友好的许可。使用者也可以在需要的时候修改代码来满足需要并作为开源或商业产品发布/销售
6. 你可以二次包装出售，**但还请保留文件中的版权和作者信息**，并在你的产品说明中注明JeeSite。
7. 你可以以任何方式获得，你可以修改包名或类名，**但还请保留文件中的版权和作者信息**。

##为何使用MyBatis

* 学习成本：Hibernate的真正掌握要比Mybatis来得难不少。Mybatis框架相对简单很容易上手，也更加灵活。
对于学习过Hibernate的用户，学习起MyBatis也更容易上手。

* 开发成本：大家都说Hibernate开发效率高，个人认为MyBatis的开发效率并不比Hibernate低，
通过代码生成器和封装开发效率不是问题，并且MyBatis可控性比较高，并更易于维护。

* 性能方面：由于Hibernate比较难以掌握，性能方面也成为了Hibernate的问题瓶颈，当然如果你对Hibernate非常熟，
Hibernate性能上定不是问题。但对于大多数情况下，真正掌握Hibernate的人少之又少，然而的也就造就了项目风险加大。

* 多数据库支持：有些人说MyBatis对多数据库支持困难，我认为这个不是问题，虽说目前JeeSite仅提供对MySql或Oracle
数据库的支持，但对于支持其它数据库的改动也不是很麻烦，SQL是被专门写在XML中，对于大多数SQL来说都是通用的，
对于不同的数据库可通过dbName区分和修改各别的SQL片段即可。

上述纯属个人观点，欢迎指正（thinkgem@163.com）。

如果你仍然喜欢Hibernate，请点击[下载JeeSite Hibernate版本](https://github.com/thinkgem/jeesite/tree/master_hibernate)。








 备注：其实mvn会检测当前目录下的pom.xml文件

2、还原数据库

启动phpStudy的MySql服务，并确定MySql已经设置好密码。

打开【C:\Users\Jim\Desktop\jeesite-master20161117\jeesite-master\src\main\resources\jeesite.properties】，修改mysql的账号密码，如下：



在mysql上新建名为【jeesite】的数据库：



 

回到C:\Users\Jim\Desktop\jeesite-master20161117\jeesite-master

在上面的目录随便找个空白的地方，按【Shift】键+【右键】，选择【在此处打开命令窗口】

在命令行窗口输入【mvn antrun:run -Pinit-db】，运行后出现如下成功提示：



并打开mysql查看jeesite数据库上是否有表和数据：



 

到此，数据库还原完毕。

 3、用mvn进行打包测试工程是否正常生成war包

回到C:\Users\Jim\Desktop\jeesite-master20161117\jeesite-master

在上面的目录随便找个空白的地方，按【Shift】键+【右键】，选择【在此处打开命令窗口】

在命令行窗口输入【mvn clean package -Dmaven.test.skip=true】，出现如下提示，证明成功：



最后查看此目录下是否有war文件："C:\Users\Jim\Desktop\jeesite-master20161117\jeesite-master\target\jeesite.war"

4、exlipse的导入和运行

前提：在【Window】->【Preferences】->【Maven】->【User Settings】设置maven的xml和目录：



设置好之后，重启exlipse。

1、打开exlipse，【File】->【Import】->【Maven】->【Existing Maven Projects】:



【Browse】选择jeesite所在目录



【Finish】导入完成。

4、将项目运行在tomcat上

这里假设已经环境配置好tomcat

1)使用maven命令运行在tomcat上，项目->【右键】->【Run As】->【Maven build】->输入【tomcat7:run】,好了之后，浏览器输入http://127.0.0.1:8181/jeesite进行访问。



2)用Run on Server运行在tomcat上

 比较关键的一步：右键【以管理员身份运行】exlipse，然后添加tomcat server:











点击【Finish】之后，就会推送到“E:\开发工程\workspace_web\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps”这个目录，会发现jeesite已经推送到这里。

出现如下信息，代码成功：



如果出现403或者500的错误，一定是上面某一步设置错误，重新开始再来一次。如果还是不行，可以参考这个方法，确定依赖已经复制过去：http://www.cnblogs.com/EasonJim/p/6691781.html

或者我直接删除整个workpase，然后再导入jeesite。

以下是我出现了500的错误解决：



1)重装tomcat7

我发觉装的时候出现了这个错误：，那么直接删除tomcat7的目录，然后命令行：【sc delete Tomcat7】，再装，成功运行。

最后发觉还是不行。

2)查看日志“C:\Program Files\Apache Software Foundation\logs\jeesite\jeesite.log”，发现了

database错误，那么再重新进入mysql管理页面，把之前的jeesite删除，再通过上面第2步导入数据库。

好消息，神奇的成功了：



上面测试了用单纯的tomcat7能正常跑起来，那么就来测试以下在exlipse下是否成功，参照上面第4步进行，我发觉还是不行，我使用的release版本为1.2.6，再试一下把打的包放到tomcat的目录下，看能否正常运行。试过之后我发觉是正常的。

我再回来exlipse运行项目发觉又是正常的，奇怪，难道是我在单独的tomcat上运行的问题，我再去tomcat目录下删除jeesite，再试exlipse。在exlipse上也把jeesite项目和workpace全部删除再导入试下。最后也是完全正常。

 

 

超级管理员账号：thinkgem/admin

资源下载：

已经包含jeesite的程序包和maven全部jar包，其中maven包直接放在C:\maven

链接：http://pan.baidu.com/s/1bz5IQa 密码：68o4

 

1、mvn进行包的还原

下载回来之后把zip包解压到桌面，我的如图所示：

C:\Users\Jim\Desktop\jeesite-master20161117\jeesite-master

在上面的目录随便找个空白的地方，按【Shift】键+【右键】，选择【在此处打开命令窗口】

在命令行窗口输入【mvn -Declipse.workspace=%cd% eclipse:clean eclipse:eclipse】

出现如下提示证明已经成功：


 备注：其实mvn会检测当前目录下的pom.xml文件



在命令行窗口输入【mvn antrun:run -Pinit-db】，运行后出现如下成功提示：


在命令行窗口输入【mvn clean package -Dmaven.test.skip=true】，出现如下提示，证明成功：

最后查看此目录下是否有war文件："C:\Users\Jim\Desktop\jeesite-master20161117\jeesite-master\target\jeesite.war"


这里假设已经环境配置好tomcat

1)使用maven命令运行在tomcat上，项目->【右键】->【Run As】->【Maven build】->输入【tomcat7:run】,
好了之后，浏览器输入http://127.0.0.1:8181/jeesite进行访问。

2)用Run on Server运行在tomcat上















