package cn.itcast.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

//@SpringBootApplication
//@EnableDiscoveryClient // 开启Eureka客户端
//@EnableCircuitBreaker // Hystrix客户端
@SpringCloudApplication
@MapperScan("cn.itcast.consumer.mapper")
@EnableFeignClients // 开启Feign功能
public class ConsumerApplication {

    @Bean
    @LoadBalanced // 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}