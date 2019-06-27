package com.lingyi.liutao.bean;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("workS")
@ApiModel(value="WorkS对象", description="")
public class WorkS extends Model<WorkS> {

    private static final long serialVersionUID = 1L;

    private String oId;

    private String wId;

    private Integer status;

    private String ime;

    private Integer delflag;


    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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
        return "WorkS{" +
        "oId=" + oId +
        ", wId=" + wId +
        ", status=" + status +
        ", ime=" + ime +
        ", delflag=" + delflag +
        "}";
    }
}
