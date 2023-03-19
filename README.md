# Springboot笔记
# springboot

1.springboot配置tomcat容器

问题总结：idea版本与jdk，maven版本不一致导致的项目构建失败问题;

1.1  默认配置是tomcat,默认端口是8080

​		原理：

​				关于Tomcat的所有属性都在org.springframework.boot.autoconfigure.web.ServerProperties配置类中做了定义，我们只需在application.properties配置属性做配置即可。通用的Servlet容器配置都以"server"作为前缀，而Tomcat特有配置都以"server.tomcat"作为前缀。

​		配置：在配置文件中进行配置即可		

```
server.port=xxx	
```

2.springboot配置其他容器

​		2.1 jetty和Undertow

3.springboot原生的属性注入

​	3.1原生的属性注入 

```
1.如果属性定义在.properties中，则文件会被自动加载，直接通过@value注解使用即可
2.如果是自定义的文件则通过@PropertySource注解加载自定义的配置文件@PropertySource("classpath:book.properties")
```

4.类型安全注入

```
通过设置属性前缀进行属性值的自动匹配，这样做的目的就是为了防止空的属性注入没有值
```

5.yaml配置

```
1.properties配置底层是properties继承自hashtable是无序的
2.yaml配置底层是linkedhashmap()是有序的 通过snakeyml加载 @PropertySource注解不能加载yml配置文件
springboot默认只会加载application.yml文件

```

