package com.lingyi.liutao.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Report对象", description="")
public class Report extends Model<Report> {

    private static final long serialVersionUID = 1L;

    private String rId;

    private Integer rtId;

    private String rContext;

    private String pltfId;

    private String oId;

    private String dfdtId;

    @TableField("r_Status")
    private Boolean rStatus;

    private String mId;

    private Boolean rResult;

    private String rRescontext;

    private Integer delflag;


    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public Integer getRtId() {
        return rtId;
    }

    public void setRtId(Integer rtId) {
        this.rtId = rtId;
    }

    public String getrContext() {
        return rContext;
    }

    public void setrContext(String rContext) {
        this.rContext = rContext;
    }

    public String getPltfId() {
        return pltfId;
    }

    public void setPltfId(String pltfId) {
        this.pltfId = pltfId;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getDfdtId() {
        return dfdtId;
    }

    public void setDfdtId(String dfdtId) {
        this.dfdtId = dfdtId;
    }

    public Boolean getrStatus() {
        return rStatus;
    }

    public void setrStatus(Boolean rStatus) {
        this.rStatus = rStatus;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public Boolean getrResult() {
        return rResult;
    }

    public void setrResult(Boolean rResult) {
        this.rResult = rResult;
    }

    public String getrRescontext() {
        return rRescontext;
    }

    public void setrRescontext(String rRescontext) {
        this.rRescontext = rRescontext;
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
        return "Report{" +
        "rId=" + rId +
        ", rtId=" + rtId +
        ", rContext=" + rContext +
        ", pltfId=" + pltfId +
        ", oId=" + oId +
        ", dfdtId=" + dfdtId +
        ", rStatus=" + rStatus +
        ", mId=" + mId +
        ", rResult=" + rResult +
        ", rRescontext=" + rRescontext +
        ", delflag=" + delflag +
        "}";
    }
}
