package com.lingyi.gaolichao.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Registering对象", description="")
public class Registering extends Model<Registering> {

    private static final long serialVersionUID = 1L;

    private String name;

    private String pwd;

    private Integer phone;

    private String email;

    private String chatname;

    private Integer market;

    private String shopname;

    private Boolean who;

    private Integer delflag;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChatname() {
        return chatname;
    }

    public void setChatname(String chatname) {
        this.chatname = chatname;
    }

    public Integer getMarket() {
        return market;
    }

    public void setMarket(Integer market) {
        this.market = market;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Boolean getWho() {
        return who;
    }

    public void setWho(Boolean who) {
        this.who = who;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Registering{" +
        "name=" + name +
        ", pwd=" + pwd +
        ", phone=" + phone +
        ", email=" + email +
        ", chatname=" + chatname +
        ", market=" + market +
        ", shopname=" + shopname +
        ", who=" + who +
        ", delflag=" + delflag +
        ", id=" + id +
        "}";
    }
}
