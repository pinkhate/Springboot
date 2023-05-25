#包扫描
#方法一
#1.在pom.xml文件中配置扫描文件路径
#            <resources>
#                 <resource>
#                    <directory>src/main/resources</directory>
#               </resource>
#                 <resource>
#                    <directory>src/main/java</directory>
#                    <includes>
#                        <include>com/example/demoeasyexcel/mapper/*.xml</include>
#                    </includes>
#                </resource>
#            </resources>
#2.在启动类上面添加包扫描注解 @MapperScan(basePackages = "com.example.demoeasyexcel.mapper")
#方法二
#1.在配置文件中添加包扫描路径mybatis.mapper-locations=classpath:com/example/demoeasyexcel/mapper/*.xml
#2.将mapper文件夹建在resources文件夹下的相同目录下实现包扫
