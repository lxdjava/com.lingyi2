package com.lingyi.gaolichao.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Worker对象", description="")
public class Worker extends Model<Worker> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "w_id", type = IdType.AUTO)
    private String wId;

    private String wName;

    private String wPwd;

    private Integer wPhone;

    private Integer wEmail;

    private Integer delflag;

    private LocalDate inputtime;

    private Integer credit;

    private Integer money;

    private Integer fmoney;

    private Integer viplevel;

    private Boolean blacklist;


    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwPwd() {
        return wPwd;
    }

    public void setwPwd(String wPwd) {
        this.wPwd = wPwd;
    }

    public Integer getwPhone() {
        return wPhone;
    }

    public void setwPhone(Integer wPhone) {
        this.wPhone = wPhone;
    }

    public Integer getwEmail() {
        return wEmail;
    }

    public void setwEmail(Integer wEmail) {
        this.wEmail = wEmail;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public LocalDate getInputtime() {
        return inputtime;
    }

    public void setInputtime(LocalDate inputtime) {
        this.inputtime = inputtime;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getFmoney() {
        return fmoney;
    }

    public void setFmoney(Integer fmoney) {
        this.fmoney = fmoney;
    }

    public Integer getViplevel() {
        return viplevel;
    }

    public void setViplevel(Integer viplevel) {
        this.viplevel = viplevel;
    }

    public Boolean getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Boolean blacklist) {
        this.blacklist = blacklist;
    }

    @Override
    protected Serializable pkVal() {
        return this.wId;
    }

    @Override
    public String toString() {
        return "Worker{" +
        "wId=" + wId +
        ", wName=" + wName +
        ", wPwd=" + wPwd +
        ", wPhone=" + wPhone +
        ", wEmail=" + wEmail +
        ", delflag=" + delflag +
        ", inputtime=" + inputtime +
        ", credit=" + credit +
        ", money=" + money +
        ", fmoney=" + fmoney +
        ", viplevel=" + viplevel +
        ", blacklist=" + blacklist +
        "}";
    }
}
