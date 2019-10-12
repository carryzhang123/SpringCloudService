package cn.itcast.consumer.web;

import cn.itcast.consumer.feign.UserClient;
import cn.itcast.consumer.pojo.Account;
import cn.itcast.consumer.pojo.User;
import cn.itcast.consumer.service.UserService;
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

    @Autowired
    private UserClient userClient;

    @Autowired
    private UserService userService;

    @GetMapping("{usernameinfo}")
    public Account queryAllInfoByUsername(@PathVariable("usernameinfo") String username) {
        User user = userService.queryEmailByUsername(username);
        Account account=userClient.queryById(user.getUserId());
        account.setEmail(user.getEmail());
        return account;
    }


    @GetMapping("{username}")
    public User queryEmailByusername(@PathVariable("username") String username){
        return userService.queryEmailByUsername(username);
    }
//    public String defaultFallBack() {
//        log.error("访问出错");
//        return "网络太拥挤";
//    }
}