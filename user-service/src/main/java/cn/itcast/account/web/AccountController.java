package cn.itcast.account.web;

import cn.itcast.account.pojo.Account;
import cn.itcast.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Account queryById(@PathVariable("id") Long id) throws Exception {
        return accountService.queryById(id);
    }
}