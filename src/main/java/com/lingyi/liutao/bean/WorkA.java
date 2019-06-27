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
@TableName("workA")
@ApiModel(value="WorkA对象", description="")
public class WorkA extends Model<WorkA> {

    private static final long serialVersionUID = 1L;

    private String oId;

    private String wId;

    private String time;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
        return "WorkA{" +
        "oId=" + oId +
        ", wId=" + wId +
        ", time=" + time +
        ", delflag=" + delflag +
        "}";
    }
}
