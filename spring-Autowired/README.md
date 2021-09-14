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

如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候，我们可以使用@Qualifier（value=”xxx“）去配置

##注解说明
- @Autowired：自动装配通过类型，名字如果@Autowired不能唯一自动装配上属性，则需要通过一个@Qualifier（value=”xxx“）去配置
- @Nullable：字段标记了这个注解，说明这个字段可以为null
- @Resource：自动装配通过名字，类型
- @Component：组件，放在类上，说明这个类已经被Spring管理了，就是bean！