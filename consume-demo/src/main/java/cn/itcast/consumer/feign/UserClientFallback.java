package cn.itcast.consumer.feign;

import cn.itcast.consumer.pojo.Account;
import cn.itcast.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public Account queryById(Long id) {
        Account account = new Account();
        account.setId(id);
        account.setAccountName("用户查询出现异常！");
        return account;
    }
}
