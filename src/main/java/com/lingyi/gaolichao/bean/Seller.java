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
@ApiModel(value="Seller对象", description="")
public class Seller extends Model<Seller> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "s_id", type = IdType.AUTO)
    private String sId;

    private String sName;

    private String sPwd;

    private Integer sPhone;

    private Integer sEmail;

    private Integer delflag;

    private LocalDate inputtime;

    private Integer credit;

    private Integer money;

    private Integer fmoney;

    private Integer viplevel;

    private Boolean blacklist;


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd;
    }

    public Integer getsPhone() {
        return sPhone;
    }

    public void setsPhone(Integer sPhone) {
        this.sPhone = sPhone;
    }

    public Integer getsEmail() {
        return sEmail;
    }

    public void setsEmail(Integer sEmail) {
        this.sEmail = sEmail;
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
        return this.sId;
    }

    @Override
    public String toString() {
        return "Seller{" +
        "sId=" + sId +
        ", sName=" + sName +
        ", sPwd=" + sPwd +
        ", sPhone=" + sPhone +
        ", sEmail=" + sEmail +
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
