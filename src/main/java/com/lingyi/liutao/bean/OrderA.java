package com.lingyi.liutao.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 222
 * </p>
 *
 * @author lixiaodong
 * @since 2019-06-22
 */
@TableName("orderA")
@ApiModel(value="OrderA对象", description="")
public class OrderA extends Model<OrderA> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "o_id", type = IdType.AUTO)
    private String oId;

    private String sId;

    private String wCredit;

    private Integer oTimes;

    private Integer oDone;

    private Integer oCost;

    private String oTime;

    private String oLasttime;

    private String oKeyword;

    private String oPic;

    private String oWholename;

    private String oUrl;

    private String oStatus;

    private Integer market;

    private Integer delflag;


    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getwCredit() {
        return wCredit;
    }

    public void setwCredit(String wCredit) {
        this.wCredit = wCredit;
    }

    public Integer getoTimes() {
        return oTimes;
    }

    public void setoTimes(Integer oTimes) {
        this.oTimes = oTimes;
    }

    public Integer getoDone() {
        return oDone;
    }

    public void setoDone(Integer oDone) {
        this.oDone = oDone;
    }

    public Integer getoCost() {
        return oCost;
    }

    public void setoCost(Integer oCost) {
        this.oCost = oCost;
    }

    public String getoTime() {
        return oTime;
    }

    public void setoTime(String oTime) {
        this.oTime = oTime;
    }

    public String getoLasttime() {
        return oLasttime;
    }

    public void setoLasttime(String oLasttime) {
        this.oLasttime = oLasttime;
    }

    public String getoKeyword() {
        return oKeyword;
    }

    public void setoKeyword(String oKeyword) {
        this.oKeyword = oKeyword;
    }

    public String getoPic() {
        return oPic;
    }

    public void setoPic(String oPic) {
        this.oPic = oPic;
    }

    public String getoWholename() {
        return oWholename;
    }

    public void setoWholename(String oWholename) {
        this.oWholename = oWholename;
    }

    public String getoUrl() {
        return oUrl;
    }

    public void setoUrl(String oUrl) {
        this.oUrl = oUrl;
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus;
    }

    public Integer getMarket() {
        return market;
    }

    public void setMarket(Integer market) {
        this.market = market;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    @Override
    protected Serializable pkVal() {
        return this.oId;
    }

    @Override
    public String toString() {
        return "OrderA{" +
        "oId=" + oId +
        ", sId=" + sId +
        ", wCredit=" + wCredit +
        ", oTimes=" + oTimes +
        ", oDone=" + oDone +
        ", oCost=" + oCost +
        ", oTime=" + oTime +
        ", oLasttime=" + oLasttime +
        ", oKeyword=" + oKeyword +
        ", oPic=" + oPic +
        ", oWholename=" + oWholename +
        ", oUrl=" + oUrl +
        ", oStatus=" + oStatus +
        ", market=" + market +
        ", delflag=" + delflag +
        "}";
    }
}
