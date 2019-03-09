# generator-web


简便直观的可视化生成界面，填写正确的配置即可一秒下载entity、mapper、dao文件。
目前只能生成Entity后缀的实体类和Dao后缀的映射文件，是个缺陷。


>  本项目为maven项目，力求用最小的容量来实现功能，只使用了JSP和servlet。

>  mybatis-generator.jar，针对此jar包我们自己做了优化改造，主要改动有：
>  1、优化mybitis配置文件代码结构（空格的缩进、元素与元素之间加空行等 ）。
>  2、修改namespace的生成规则。
>  3、修改dao和Entity的命名规则和样式。
>  4、增加entity注释。
>  5、优化dao文件方法名字。
>  6、修改对大对象类型的处理。


>  可根据您的实际使用情况添加各种个性化功能。
>  建议java编译版本为1.8以下。
