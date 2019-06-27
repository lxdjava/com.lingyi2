package com.lingyi.liutao.bean;

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
@ApiModel(value="ReportType对象", description="")
public class ReportType extends Model<ReportType> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rt_id", type = IdType.AUTO)
    private Integer rtId;

    private String rtContext;

    private Boolean rtFrom;

    private Integer delflag;


    public Integer getRtId() {
        return rtId;
    }

    public void setRtId(Integer rtId) {
        this.rtId = rtId;
    }

    public String getRtContext() {
        return rtContext;
    }

    public void setRtContext(String rtContext) {
        this.rtContext = rtContext;
    }

    public Boolean getRtFrom() {
        return rtFrom;
    }

    public void setRtFrom(Boolean rtFrom) {
        this.rtFrom = rtFrom;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    @Override
    protected Serializable pkVal() {
        return this.rtId;
    }

    @Override
    public String toString() {
        return "ReportType{" +
        "rtId=" + rtId +
        ", rtContext=" + rtContext +
        ", rtFrom=" + rtFrom +
        ", delflag=" + delflag +
        "}";
    }
}
