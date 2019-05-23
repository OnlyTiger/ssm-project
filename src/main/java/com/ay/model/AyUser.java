package com.ay.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Ay
 * @create 2018/05/16
 **/
public class AyUser implements Serializable {

    private Integer id;
    @NotBlank
    private String name;
    @Length(min = 8, max = 16)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //省略set、get方法
}

