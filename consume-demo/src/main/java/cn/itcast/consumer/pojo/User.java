package cn.itcast.consumer.pojo;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String accountName; // 用户名

    private Long money; // 密码
}