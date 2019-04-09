# spring-cloud-example

- 基于zookeeper的服务注册以及发现, 
- 基于zookeeper的配置中心

## user-service : 9002,9003,9004
- 底层服务，模拟user服务，提供用户相关服务

## eureka-server : 9001
- Eureka的服务，

## caller : 9005
- 集成Feign，Ribbon，eureka-client，
- 完成服务发现，负载均衡，并且直接调用后端服务, 无网关.

## gateway : 9006
- 基于zuul，Feign，Ribbon，eureka的网关简单实现

## config-server : 9007
- 配置管理服务, 基于gitlab, security的配置管理服务

## demo
- 全是jar包，三个user-service，一个eureka-server，一个zuul网关,一个config-server
