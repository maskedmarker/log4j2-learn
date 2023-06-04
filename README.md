# 目标
1.log4j2的基本用法
2.log4j2与springboot的组合使用

# 关键概念


# 注意事项
## log4j2的原始使用方法
使用方式: org.apache.logging.log4j.LogManager.getLogger(java.lang.Class<?>)

## apache-commons-logging与log4j2(spring-jcl包的实现版)
使用方法: org.apache.commons.logging.LogFactory.getLog(java.lang.Class<?>)
注意LogFactory的javadoc描述,It rather only checks for the presence of the Log4j 2.x API and the SLF4J 1.7 API in the Spring Framework classpath, falling back to java.util.logging if none of the two is available.
org.apache.commons.logging.LogAdapter会在classpath查找log4j和slf4j的关键类是否存在,
如果都存在,则apache-commons-logging直接使用slf4j来达到间接使用log4j
如果直接log4j,则apache-commons-logging直接使用log4j
如果都不在,则使用apache-commons-logging直接使用java.util.logging

## slf4j与log4j2


## spring与log4j2和slf4j
spring框架使用的facade层是apache-commons-logging,而非slf4j.通常应用层代码使用slf4j这样的facade层.
