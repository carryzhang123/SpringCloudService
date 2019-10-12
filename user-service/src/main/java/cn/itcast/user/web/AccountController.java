package cn.itcast.user.web;

import cn.itcast.user.pojo.Account;
import cn.itcast.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class AccountController {

    @Autowired
    private AccountService userService;

    @GetMapping("/{id}")
    public Account queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}