package cn.itcast.user.service;

import cn.itcast.user.mapper.AccountMapper;
import cn.itcast.user.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account queryById(Long id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}