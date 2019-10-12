package cn.itcast.consumer.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
public class Account {

    private Long id;

    private String accountName; // 用户名

    private Long money; // 密码

    private String email;
}