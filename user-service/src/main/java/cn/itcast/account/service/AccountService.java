package cn.itcast.account.service;

import cn.itcast.account.mapper.AccountMapper;
import cn.itcast.account.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account queryById(Long id) throws Exception {
        if(id==1){
            throw new Exception();
        }
        return accountMapper.selectByPrimaryKey(id);
    }
}