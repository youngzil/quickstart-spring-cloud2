[Nacos如何实现服务自动注册](https://xie.infoq.cn/article/452010f62b961ca3cf90659f1)
[10大高性能开发宝石](https://xie.infoq.cn/article/a0d418bf29915ecad5d5eeab0)

[SpringBoot和SpringCloud学习参考](https://github.com/ityouknow?tab=repositories)


---------------------------------------------------------------------------------------------------------------------  

[悠闲]SpringCloud微服务全栈解析架构知识图谱
SpringCloud微服务响应式异步系统架构
"•SOA、Webservice、Dubbo、SpringCloud究竟什么是微服务？
•单体应用向微服务异构平台架构演变
🌙传统项目向微服务异构平台架构演变
响应式微服务服务
[乱舞]都2020年了 还没用过微服务吗？单体应用向微服务异构平台架构演变
------------------------------
[玫瑰]传统项目向微服务异构平台架构演变
[玫瑰]SpringCloud微服务组件生态体系 SpringCloud Netflix/Alibaba
[玫瑰]从零开始构建微服务项目各组件应用场景及代码实现
[玫瑰]常用中间件服务核心解密与技术选型
[玫瑰]大数据技术在微服务中的应用
[玫瑰]淘宝网/拼多多 高并发秒杀系统需求拆解
[玫瑰]如何把整套技术图谱做成鼠标垫
[嘿哈]面试的时候高并发回答的总是不能让面试官满意？
[嘿哈]一个互联网项目究竟有多少细节？
[嘿哈]网上搜了一堆秒杀系统方案，究竟真实的线上电商该怎么做？
[嘿哈]如何把整套技术图谱做成鼠标垫
----------------
[勾引]戳此进直播间啦：https://ke.qq.com/webcourse/index.html?cid=399017&term_id=100475965&taid=9751182080087721&from=41


@所有人
[飞吻]SpringCloud Alibaba 一节课搞定 #新版微服务

[月亮]晚上：20：00
[跳跳]主讲老师：张一明老师
--------------
⚠SpringCloud微服务生态体系 SpringCloud Netflix/Alibaba
⚠SpringCloud 全栈图谱
⚠SpringCloud Alibaba Sentinel 是什么？
⚠SpringCloud Alibaba Sentinel 与 Hystrix 的对比
⚠SpringCloud Alibaba Sentinel Dashboard
⚠SpringCloud Alibaba Nacos 与 Nacos Dashboard
⚠SpringCloud Alibaba Sentinel 整合 Nacos 实现限流配置 动态下发
⚠微服务中常用中间件服务核心解密与技术选型
⚠互联网项目微服务高并发系统架构
---------------
[社会社会]直播地址：https://ke.qq.com/course/2774006?taid=10542675835638774&tuin=61636560


⛄一步一步，单体到分布式微服务项目演变
----------------
[爱情]传统项目与互联网项目的异同
[爱情]传统项目改造方法论
[爱情]互联网项目依赖的分布式协调实现
[爱情]微服务在互联网项目中的本质
[爱情]分布式中间件的技术选型参考
[爱情]高并发，高可用与互联网项目结合
[爱情]负载均衡种类与项目维度的结合
[爱情]LVS & Nginx在项目中技术选型
[爱情]redis缓存在分布式中的技术选型决策
[爱情]zookeeper如何解决分布式协调问题
[爱情]kafka等MQ技术在分布式中的技术选型和决策
[爱情]现代程序员的基本素质和素养
[爱情]针对程序员的发展进阶规划
----------------



💪SpringCloud Alibaba 一节课搞定 #新版微服务

🍺今晚20：00
👻主讲老师：张一明老师
----------------
⚡什么是微服务
⚡微服务的演化过程
⚡如何从传统项目平滑过渡
⚡Sentinel 是什么？
⚡Sentinel 与 Hystrix 的对比
⚡Sentinel Dashboard
⚡Nacos 与 Nacos Dashboard
⚡Sentinel 整合 Nacos 实现限流配置 动态下发
----------------
👉戳此进直播间：https://ke.qq.com/course/399017?taid=10573088496686761&tuin=a028e035



主要包含 11 大核心组件，分别是：

核心支撑组件

服务框架 Spring MVC/Boot

监控反馈组件

服务拆分与治理
亿级流量网关系统架构与设计
 



[疑问]Spring Cloud微服务架构中如何做限流？
----------------
[闪电]1. 微服务架构中限流需要考虑的几个环节？
[闪电]2. 计数器法、滑动窗口、令牌桶算法和漏桶算法。
[闪电]3. 网关限流的落地实战。
[闪电]4. 单个服务限流的落地实战。
[勾引]戳此进直播间啦：https://ke.qq.com/webcourse/index.html?cid=399017&term_id=100475965&taid=9751182080087721&from=41


[转圈]一节课教你：注册中心从入门到精通还有生产的坑
--------------------
🌟先看几个Eureka在生产环境中的坑。
🌟 注册中心的核心数据存储结构。
🌟注册中心提供的功能。
🌟实战：搭建单体注册中心，集群注册中心，多区域部署。
🌟注册中心原理讲解。
🌟生产调优。





服务注册中心：Eureka、Consul、Zookeeper
Provider：DiscoveryClient接口
Consumer：
1、LoadBalancerClient和RestTemplate，先通过loadBalancerClient的choose函数来负载均衡的选出一个Provider的服务实例，再利用RestTemplate对象实现对服务提供者接口的调用。
2、Ribbon：RestTemplate增加@LoadBalanced注解
3、Feign：@FeignClient注解把类绑定到某个服务，@GetMapping绑定到服务的某个接口



服务注册中心（服务治理框架）：Eureka、Consul、Zookeeper
Provider：通过DiscoveryClient注册接口
Consumer：声明式服务调用客户端Feign+请求合并Hystrix Collapser+客户端负载均衡的工具Ribbon+服务网关Zuul+服务容错保护Hystrix（服务降级，服务熔断、服务监控Turbine）
分布式配置中心：Spring-Cloud-Config
消息驱动：Spring Cloud Stream
服务跟踪：Spring Cloud Sleuth+ Zipkin/ELK（ELK日志分析平台，Zipkin性能分析时间延迟）



重试机制
限流
负载均衡
降级（本地缓存）
熔断机制



1、服务注册中心（服务治理框架）：Eureka、Consul、Zookeeper
2、客户端负载均衡的工具:Ribbon
3、声明式服务调用客户端：Feign
4、分布式配置中心：Spring-Cloud-Config
5、服务容错保护:Hystrix,Hystrix具备了服务降级、服务熔断（断路器）、线程隔离（依赖隔离）、请求缓存、请求合并以及服务监控（Dashboard）等强大功能,在监控页面可以看到Hystrix的线程池的状态（线程数、活跃线程数等）
6、Hystrix监控数据聚合：Turbine
7、服务网关：Zuul，除了具备服务路由、均衡负载功能之外，它还具备了权限控制（过滤器）等功能。nginx、httpd等
8、Spring Cloud Stream是一个用来为微服务应用构建消息驱动能力的框架，消费组，消息分区等功能
9、分布式服务跟踪：Spring Cloud Sleuth：ELK日志分析平台，Zipkin性能分析时间延迟
10、请求合并：Collapser可以合并多个请求一起调用


1、Provider服务注册Eureka
2、Consumer使用ribbon+restTemplate/feign调用服务
3、Consumer+请求合并Hystrix Collapser+负载均衡的工具Ribbon+服务网关Zuul+服务容错保护Hystrix



Eureka:服务注册、服务续约 、获取注册列表信息 
当Eureka客户端向Eureka Server注册时，它提供自身的元数据，比如IP地址、端口，运行状况指示符URL，主页等。
Eureka客户会每隔30秒发送一次心跳来续约。 通过续约来告知Eureka Server该Eureka客户仍然存在，没有出现问题。
Eureka客户端从服务器获取注册表信息，并将其缓存在本地。客户端会使用该信息查找其他服务，从而进行远程调用。该注册列表信息定期（每30秒钟）更新一次。



Ribbon：
总结
综上所述，Ribbon的负载均衡，主要通过LoadBalancerClient来实现的，而LoadBalancerClient具体交给了ILoadBalancer来处理，ILoadBalancer通过配置IRule、IPing等信息，并向EurekaClient获取注册列表的信息，并默认10秒一次向EurekaClient发送“ping”,进而检查是否更新服务列表，最后，得到注册列表后，ILoadBalancer根据IRule的策略进行负载均衡。

而RestTemplate 被@LoadBalance注解后，能过用负载均衡，主要是维护了一个被@LoadBalance注解的RestTemplate列表，并给列表中的RestTemplate添加拦截器，进而交给负载均衡器去处理。





在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign。
第一种，在类中定义熔断调用方法
第二种：#Feign是自带断路器的，它没有默认打开。需要在配置文件中配置打开它，feign.hystrix.enabled=true，还要在类中指定熔断调用类

在Spring Cloud微服务系统中，一种常见的负载均衡方式是，客户端的请求首先经过负载均衡（zuul、Ngnix），再到达服务网关（zuul集群），然后再到具体的服。，服务统一注册到高可用的服务注册中心集群，服务的所有的配置文件由配置服务管理，配置服务的配置文件放在git仓库，方便开发人员随时改配置。



我们使用Spring Cloud Netflix中的Eureka实现了服务注册中心以及服务注册与发现；
而服务间通过Ribbon或Feign实现服务的消费以及均衡负载；
通过Spring Cloud Config实现了应用多环境的外部化配置以及版本管理。
为了使得服务集群更为健壮，使用Hystrix的融断机制来避免在微服务架构中个别服务出现异常时引起的故障蔓延。




在pom.xml依赖中引入logstash-logback-encoder依赖
在工程/resource目录下创建logback配置文件logback-spring.xml，配置为logstash输出的json格式的Appender




客户端负载均衡的工具:Ribbon
Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具。它是一个基于HTTP和TCP的客户端负载均衡器。它可以通过在客户端中配置ribbonServerList来设置服务端列表去轮询访问以达到均衡负载的作用。

当Ribbon与Eureka联合使用时，ribbonServerList会被DiscoveryEnabledNIWSServerList重写，扩展成从Eureka注册中心中获取服务实例列表。同时它也会用NIWSDiscoveryPing来取代IPing，它将职责委托给Eureka来确定服务端是否已经启动。

而当Ribbon与Consul联合使用时，ribbonServerList会被ConsulServerList来扩展成从Consul获取服务实例列表。同时由ConsulPing来作为IPing接口的实现。



声明式服务调用客户端：Feign
Spring Cloud Feign是一套基于Netflix Feign实现的声明式服务调用客户端。它使得编写Web服务客户端变得更加简单。我们只需要通过创建接口并用注解来配置它既可完成对Web服务接口的绑定。它具备可插拔的注解支持，包括Feign注解、JAX-RS注解。它也支持可插拔的编码器和解码器。Spring Cloud Feign还扩展了对Spring MVC注解的支持，同时还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现。

通过Spring Cloud Feign来实现服务调用的方式更加简单了，通过@FeignClient定义的接口来统一的生命我们需要依赖的微服务接口。而在具体使用的时候就跟调用本地方法一点的进行调用即可。由于Feign是基于Ribbon实现的，所以它自带了客户端负载均衡功能，也可以通过Ribbon的IRule进行策略扩展。另外，Feign还整合的Hystrix来实现服务的容错保护，在Dalston版本中，Feign的Hystrix默认是关闭的。



集中化的外部配置支持：Spring Cloud Config
Spring Cloud Config是Spring Cloud团队创建的一个全新项目，用来为分布式系统中的基础设施和微服务应用提供集中化的外部配置支持，它分为服务端与客户端两个部分。其中服务端也称为分布式配置中心，它是一个独立的微服务应用，用来连接配置仓库并为客户端提供获取配置信息、加密/解密信息等访问接口；而客户端则是微服务架构中的各个微服务应用或基础设施，它们通过指定的配置中心来管理应用资源与业务相关的配置内容，并在启动的时候从配置中心获取和加载配置信息。Spring Cloud Config实现了对服务端和客户端中环境变量和属性配置的抽象映射，所以它除了适用于Spring构建的应用程序之外，也可以在任何其他语言运行的应用程序中使用。由于Spring Cloud Config实现的配置中心默认采用Git来存储配置信息，所以使用Spring Cloud Config构建的配置服务器，天然就支持对微服务应用配置信息的版本管理，并且可以通过Git客户端工具来方便的管理和访问配置内容。当然它也提供了对其他存储方式的支持，比如：SVN仓库、本地化文件系统。



服务容错保护:Hystrix,Hystrix具备了服务降级、服务熔断（断路器）、线程隔离（依赖隔离）、请求缓存、请求合并以及服务监控等强大功能
Hystrix Dashboard来展示Hystrix用于熔断的各项度量指标，通过Hystrix Dashboard，我们可以方便的查看服务实例的综合情况，比如：服务调用次数、服务调用延迟等。

在微服务架构中，我们将系统拆分成了一个个的服务单元，各单元应用间通过服务注册与订阅的方式互相依赖。由于每个单元都在不同的进程中运行，依赖通过远程调用的方式执行，这样就有可能因为网络原因或是依赖服务自身问题出现调用故障或延迟，而这些问题会直接导致调用方的对外服务也出现延迟，若此时调用方的请求不断增加，最后就会出现因等待出现故障的依赖方响应而形成任务积压，线程资源无法释放，最终导致自身服务的瘫痪，进一步甚至出现故障的蔓延最终导致整个系统的瘫痪。如果这样的架构存在如此严重的隐患，那么相较传统架构就更加的不稳定。为了解决这样的问题，因此产生了断路器等一系列的服务保护机制。

针对上述问题，在Spring Cloud Hystrix中实现了线程隔离、断路器等一系列的服务保护功能。它也是基于Netflix的开源框架 Hystrix实现的，该框架目标在于通过控制那些访问远程系统、服务和第三方库的节点，从而对延迟和故障提供更强大的容错能力。Hystrix具备了服务降级、服务熔断、线程隔离、请求缓存、请求合并以及服务监控等强大功能。




服务网关是微服务架构中一个不可或缺的部分。通过服务网关统一向外系统提供REST API的过程中，除了具备服务路由、均衡负载功能之外，它还具备了权限控制等功能。Spring Cloud Netflix中的Zuul就担任了这样的一个角色，为微服务架构提供了前门保护的作用，同时将权限控制这些较重的非业务逻辑内容迁移到服务路由层面，使得服务集群主体能够具备更高的可复用性和可测试性。

根据自己的需要在服务网关上定义一些与业务无关的通用逻辑实现对请求的过滤和拦截，比如：签名校验、权限校验、请求限流等功能。

通过前置的网关服务来完成这些非业务性质的校验。由于网关服务的加入，外部客户端访问我们的系统已经有了统一入口，既然这些校验与具体业务无关，那何不在请求到达的时候就完成校验和过滤，而不是转发后再过滤而导致更长的请求延迟。同时，通过在网关中完成校验和过滤，微服务应用端就可以去除各种复杂的过滤器和拦截器了，这使得微服务应用的接口开发和测试复杂度也得到了相应的降低。

为了在API网关中实现对客户端请求的校验，我们将需要使用到Spring Cloud Zuul的另外一个核心功能：过滤器。

Zuul允许开发者在API网关上通过定义过滤器来实现对请求的拦截与过滤，实现的方法非常简单，我们只需要继承ZuulFilter抽象类并实现它定义的四个抽象函数就可以完成对请求的拦截和过滤了。



Spring Cloud Stream是一个用来为微服务应用构建消息驱动能力的框架。它可以基于Spring Boot来创建独立的、可用于生产的Spring应用程序。它通过使用Spring Integration来连接消息代理中间件以实现消息事件驱动的微服务应用。Spring Cloud Stream为一些供应商的消息中间件产品提供了个性化的自动化配置实现，并且引入了发布-订阅、消费组以及消息分区这三个核心概念。简单的说，Spring Cloud Stream本质上就是整合了Spring Boot和Spring Integration，实现了一套轻量级的消息驱动的微服务框架。通过使用Spring Cloud Stream，可以有效地简化开发人员对消息中间件的使用复杂度，让系统开发人员可以有更多的精力关注于核心业务逻辑的处理。由于Spring Cloud Stream基于Spring Boot实现，所以它秉承了Spring Boot的优点，实现了自动化配置的功能帮忙我们可以快速的上手使用，但是目前为止Spring Cloud Stream只支持下面两个著名的消息中间件的自动化配置：
RabbitMQ
Kafka



随着业务的发展，我们的系统规模也会变得越来越大，各微服务间的调用关系也变得越来越错综复杂。通常一个由客户端发起的请求在后端系统中会经过多个不同的微服务调用来协同产生最后的请求结果，在复杂的微服务架构系统中，几乎每一个前端请求都会形成一条复杂的分布式服务调用链路，在每条链路中任何一个依赖服务出现延迟过高或错误的时候都有可能引起请求最后的失败。这时候对于每个请求全链路调用的跟踪就变得越来越重要，通过实现对请求调用的跟踪可以帮助我们快速的发现错误根源以及监控分析每条请求链路上的性能瓶颈等好处。

针对上面所述的分布式服务跟踪问题，Spring Cloud Sleuth提供了一套完整的解决方案。在本章中，我们将详细介绍如何使用Spring Cloud Sleuth来为我们的微服务架构增加分布式服务跟踪的能力。


ELK平台主要有由ElasticSearch、Logstash和Kiabana三个开源免费工具组成：

Elasticsearch是个开源分布式搜索引擎，它的特点有：分布式，零配置，自动发现，索引自动分片，索引副本机制，restful风格接口，多数据源，自动搜索负载等。
Logstash是一个完全开源的工具，他可以对你的日志进行收集、过滤，并将其存储供以后使用。
Kibana 也是一个开源和免费的工具，它Kibana可以为 Logstash 和 ElasticSearch 提供的日志分析友好的 Web 界面，可以帮助您汇总、分析和搜索重要数据日志。
Spring Cloud Sleuth在与ELK平台整合使用时，实际上我们只要实现与负责日志收集的Logstash完成数据对接即可，所以我们需要为Logstash准备json格式的日志输出。由于Spring Boot应用默认使用了logback来记录日志，而Logstash自身也有对logback日志工具的支持工具，所以我们可以直接通过在logback的配置中增加对logstash的appender，就能非常方便的将日志转换成以json的格式存储和输出了。




我们虽然已经能够利用ELK平台提供的收集、存储、搜索等强大功能，对跟踪信息的管理和使用已经变得非常便利。但是，在ELK平台中的数据分析维度缺少对请求链路中各阶段时间延迟的关注，很多时候我们追溯请求链路的一个原因是为了找出整个调用链路中出现延迟过高的瓶颈源，亦或是为了实现对分布式系统做延迟监控等与时间消耗相关的需求，这时候类似ELK这样的日志分析系统就显得有些乏力了。对于这样的问题，我们就可以引入Zipkin来得以轻松解决。

Zipkin简介
Zipkin是Twitter的一个开源项目，它基于Google Dapper实现。我们可以使用它来收集各个服务器上请求链路的跟踪数据，并通过它提供的REST API接口来辅助我们查询跟踪数据以实现对分布式系统的监控程序，从而及时地发现系统中出现的延迟升高问题并找出系统性能瓶颈的根源。除了面向开发的API接口之外，它也提供了方便的UI组件来帮助我们直观的搜索跟踪信息和分析请求链路明细，比如：可以查询某段时间内各用户请求的处理时间等。





为Spring Cloud的应用实用随机端口非常简单，主要有两种方法：
1、设置server.port=0，当应用启动的时候会自动的分配一个随机端口，但是该方式在注册到Eureka的时候会一个问题：所有实例都使用了同样的实例名（如：Lenovo-zhaiyc:hello-service:0），这导致只出现了一个实例。所以，我们还需要修改实例ID的定义，让每个实例的ID不同，比如使用随机数来配置实例ID：
server.port=0
eureka.instance.instance-id=${spring.application.name}:${random.int}

2、除了上面的方法，实际上我们还可以直接使用random函数来配置server.port。这样就可以指定端口的取值范围，比如：
server.port=${random.int[10000,19999]}
由于默认的实例ID会由server.port拼接，而此时server.port设置的随机值会重新取一次随机数，所以使用这种方法的时候不需要重新定义实例ID的规则就能产生不同的实例ID了。


使用自定义的bean覆盖Spring默认的bean：名字一样
这里隐含了一个实现命名的问题，由于默认的bean名称会使用redisHealthIndicator，所以这里的定义可以替换默认的实现，因为它的名字与@ConditionalOnMissingBean(name = "redisHealthIndicator")中的命名一致。但是如果您自定义的实现类并非叫RedisHealthIndicator，它的默认名称与自动化配置的名称是不匹配的，那么就不会替换，这个时候需要在@Component注解中指定该Bean的名称为redisHealthIndicator。


参考
https://blog.csdn.net/forezp/article/details/69696915
