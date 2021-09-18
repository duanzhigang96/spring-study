package com.duan.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Teacher implements Serializable {
    private int id;
    private String name;
    private List<User> user;
}
