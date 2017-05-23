package com.amayadream.webchat.core.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 群组
 * @author : Amayadream
 * @date :   2017-05-23 11:33
 */
public class Group implements Serializable {

    /* 主键id */
    private Long id;
    /* 群组名称 */
    private String name;
    /* 描述 */
    private String desc;
    /* 管理员/创建者 */
    private String userId;
    /* 创建时间 */
    private LocalDateTime createdTime;

    public Group() {

    }

    public Group(Long id, String name, String desc, String userId, LocalDateTime createdTime) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.userId = userId;
        this.createdTime = createdTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
}
