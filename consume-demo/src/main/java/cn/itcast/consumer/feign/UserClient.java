package cn.itcast.consumer.feign;

import cn.itcast.consumer.pojo.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "account-service", fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("/account/{id}")
    Account queryById(@PathVariable("id") Long id);
}
