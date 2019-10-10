package cn.itcast.consumer.web;

import cn.itcast.consumer.feign.UserClient;
import cn.itcast.consumer.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback = "defaultFallBack") // 熔断机制，失败后回调方法
@Slf4j
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userClient.queryById(id);
    }

//    @GetMapping("{id}")
//    @HystrixCommand// 来声明一个降级逻辑的方法
//    public String queryById(@PathVariable("id") Long id) {
//        if (id == 1) {
//            throw new RuntimeException("太忙了");
//        }
//
//        String url = "http://user-service/user/" + id;
//        String user = restTemplate.getForObject(url, String.class);
//
//        return user;
//    }

    public String defaultFallBack() {
        log.error("访问出错");
        return "网络太拥挤";
    }
}