package cn.itcast.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_account")
@Data
public class Account {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String accountName; // 用户名

    private Long money; // 密码
}