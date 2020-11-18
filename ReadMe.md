#项目：MES系统（生产执行管理系统）

###架构： JDK1.7 + Maven3 + Spring4 + Hibernate4 + Struts2 + MySQL


### 项目结构：
#### resources文件夹：
##### db.properties 数据库配置
##### log4j.properties 日志配置
##### spring.xml 日志配置
##### spring-dao.xml Spring持久层整合配置
##### spring-task.xml 定时任务配置
##### spring-tx.xml Spring事务配置
##### struts.xml Struts2配置


### 项目目标：
#### 1.Spring4+Hibernate4+Struts2 整合(202011172304完毕)
#### 2.调用Hibernate各种API
#### 3.Struts2前端后端交互方式(202011172304前端接口调用完毕)
#### 4.实现MES系统基础数据管理功能
#### 5.编写dao、service、controller层代码,运行正常(尚有问题)

### 心得：
#### 1.用Response方式返回json数据,是不用配置在struts.xml配置result的,只需要配置action

### 参考教程：https://www.cnblogs.com/moy25/p/8520031.html