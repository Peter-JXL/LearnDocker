

# LearnDocker

学习Docker时用的微服务项目，包含了SpringBoot、MyBatis、Redis、Swagger等技术。

用途：
1. 主要用于打包，并且以容器的方式运行。参考[Docker微服务实战](https://www.peterjxl.com/Docker/microservice/)
2. 使用Docker Compose编排多个容器，实现多个微服务的运行。 参考[Docker-compose容器编排](https://www.peterjxl.com/Docker/Docker-compose-container-orchestration/)



Docker系列博客：

1. [教程简介](https://www.peterjxl.com/Docker/Introduction-class/)
2. [Docker简介](https://www.peterjxl.com/Docker/Introduction-docker/#在docker出现之前)
3. [Docker安装](https://www.peterjxl.com/Docker/install/)
4. [Docker常用命令](https://www.peterjxl.com/Docker/useful-commands/)
5. [镜像的分层概念](https://www.peterjxl.com/Docker/Image-layering-concept/)
6. [发布镜像](https://www.peterjxl.com/Docker/Publish-image/)
7. [Docker私有库](https://www.peterjxl.com/Docker/Private-registry/)
8. [容器数据卷](https://www.peterjxl.com/Docker/Container-volume/)
9. [Docker常用软件安装](https://www.peterjxl.com/Docker/framework-install/)
10. [MySQL主从复制](https://www.peterjxl.com/Docker/MySQL-master-slave/)
11. [分布式存储之哈希取余算法](https://www.peterjxl.com/Docker/distributed-storage-hash-remainder/)
12. [3主3从Redis集群搭建与扩缩容](https://www.peterjxl.com/Docker/redis-cluster/)
13. [Dockerfile](https://www.peterjxl.com/Docker/Dockerfile/)
14. [Dockerfile](https://www.peterjxl.com/Docker/Dockerfile/)
15. [虚悬镜像](https://www.peterjxl.com/Docker/dangling-image/)
16. [Docker微服务实战](https://www.peterjxl.com/Docker/microservice/)
17. [Docker网络](https://www.peterjxl.com/Docker/network/)
18. [Docker-compose容器编排](https://www.peterjxl.com/Docker/Docker-compose-container-orchestration/)
19. [Portainer](https://www.peterjxl.com/Docker/Portainer/)
20. [Docker重量级监控](https://www.peterjxl.com/Docker/CIG/)
21. [完结](https://www.peterjxl.com/Docker/finish/)










## 项目结构

```
LearnDocker
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── peterjxl
│   │   │           └── learndocker
│   │   │               ├── config
│   │   │               │   ├── RedisConfig.java
│   │   │               │   └── SwaggerConfig.java
│   │   │               ├── controller
│   │   │               │   ├── OrderController.java  
│   │   │               │   └── UserController.java
│   │   │               ├── entities
│   │   │               │   ├── User.java
│   │   │               │   └── UserDTO.java
│   │   │               ├── mapper
│   │   │               │   └── UserMapper.java
│   │   │               ├── service
│   │   │               │   └── UserService.java
│   │   │               └── LearnDockerApplication.java
│   │   └── resources
│   │       ├── mapper
│   │       │   └── UserMapper.xml
│   │       └── application.properties
├── pom.xml
└──课程资料
   ├── Docker2022.docx
   ├── Docker2022.html
   └── Docker2022.mmap
```













