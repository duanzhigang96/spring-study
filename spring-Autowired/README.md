使用注解须知
1. 导入约束：context约束
2. 配置注解支持：<context:annotation-config/>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
</beans>
```
@Autowired 默认是byName方式

直接在属性上使用，还可以在set方法上使用

使用@Autowired我们可以不用编写set方法，前提是自动装配的属性在IOC容器中存在，且符合名字byName

@Autowired(required = false)
字段标记了这个注解说明这个字段可以为NULL


