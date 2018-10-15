# 该分支是dubbo+zookeeper构建的微服务项目增加分布式事务

分层多模块web项目
SpringMVC+Spring+mybatis-plus 集成redis

* commons-parent是父级项目管理子项目的maven jar包的版本信息。
* commons-util是项目中一些公共类型的存放模块。
* commons-config是项目中通用配置文件的存放模块
* commons-manaeger是微服务内聚项目
    * commons-mananger-dao dao层代码(持久层代码在这里，mybatis-plus的Mapper也是放在这里)
    * commons-manager-interface 接口类的存放模块
    * commons-manager-pojo model和pojo类型的存放路径
    * commons-manager-service 服务提供者
    * commons-manager-web 服务消费者

整个项目已经搭建好了，可以正常运行