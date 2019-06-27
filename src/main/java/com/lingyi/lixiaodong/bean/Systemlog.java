package com.lingyi.lixiaodong.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixiaodong
 * @since 2019-06-22
 */
@ApiModel(value="Systemlog对象", description="")
public class Systemlog extends Model<Systemlog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDateTime optime;

    private String ip;

    private String function;

    private String params;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOptime() {
        return optime;
    }

    public void setOptime(LocalDateTime optime) {
        this.optime = optime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Systemlog{" +
        "id=" + id +
        ", optime=" + optime +
        ", ip=" + ip +
        ", function=" + function +
        ", params=" + params +
        "}";
    }
}
