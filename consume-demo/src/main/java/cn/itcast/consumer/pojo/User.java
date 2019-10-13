package cn.itcast.consumer.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_user")
@Data
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private String userName; // 用户名

    private String email; // 邮箱

    private Long userId;// 用户标识
}