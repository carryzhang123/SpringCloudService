package cn.itcast.account.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_account")
@Data
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String accountName; // 用户名

    private Long money; // 密码
}