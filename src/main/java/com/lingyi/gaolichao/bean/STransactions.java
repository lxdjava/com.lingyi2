package com.lingyi.gaolichao.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;

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
@ApiModel(value="STransactions对象", description="")
public class STransactions extends Model<STransactions> {

    private static final long serialVersionUID = 1L;

    private String sId;

    private String oId;

    private Double money;

    private Integer type;

    private Integer outOrIn;

    private Integer delflag;


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOutOrIn() {
        return outOrIn;
    }

    public void setOutOrIn(Integer outOrIn) {
        this.outOrIn = outOrIn;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "STransactions{" +
        "sId=" + sId +
        ", oId=" + oId +
        ", money=" + money +
        ", type=" + type +
        ", outOrIn=" + outOrIn +
        ", delflag=" + delflag +
        "}";
    }
}
