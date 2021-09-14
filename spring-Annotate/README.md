##使用注解开发
- 在spring4后，要使用注解开发，必须导入AOP的包依赖
- 使用注解需要导入Context约束，增加注解的支持

1. bean
   - @Component：组件，放在类上，说明这个类已经被Spring管理了，就是bean！
2. 属性如何注入
```java
    @Value("duanzhigang")
    public String name;
```
3. 衍生的注解
   - @Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层
      - dao（@Repository）
      - service（@Service）
      - controller（@Controller）
   
   这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配bean
4. 自动装配配置
5. 作用域
   - singleton : 唯一 bean 实例，Spring 中的 bean 默认都是单例的，对单例设计模式的应用。
   - prototype : 每次请求都会创建一个新的 bean 实例。
   - request : 每一次 HTTP 请求都会产生一个新的 bean，该 bean 仅在当前 HTTP request 内有效。
   - session : 每一次来自新 session 的 HTTP 请求都会产生一个新的 bean，该 bean 仅在当前 HTTP session 内有效。
   - global-session ： 全局 session 作用域，仅仅在基于 portlet 的 web 应用中才有意义，Spring5 已经没有了。Portlet 是能够生成语义代码(例如：HTML)片段的小型 Java Web 插件。它们基于 portlet 容器，可以像 servlet 一样处理 HTTP 请求。但是，与 servlet 不同，每个 portlet 都有不同的会话。

xml 方式：
```xml
<bean id="..." class="..." scope="singleton"></bean>
```
注解方式：
```java
@Bean
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public Person personPrototype() {
    return new Person();
}
```
6. 小结
xml与注解：
   - xml更加万能，适用于任何场合。维护简单方便
   - 注解不是自己的类使用不了，维护相对复杂。

xml与注解最佳实践： 
1. xml用来管理bean
2. 注解只负责完成属性的注入。
3. 我们在使用过程中，只需要注意一个问题，必须让注解生效，就需要开启注解的支持

##坑
- 在使用过程中使用了java15出现了与spring版本不兼容的情况后改用java8