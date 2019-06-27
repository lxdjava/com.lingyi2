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
@ApiModel(value="WorkerRefMarket对象", description="")
public class WorkerRefMarket extends Model<WorkerRefMarket> {

    private static final long serialVersionUID = 1L;

    private String wId;

    private Integer marketId;

    private String chatname;

    private Integer delflag;


    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public String getChatname() {
        return chatname;
    }

    public void setChatname(String chatname) {
        this.chatname = chatname;
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
        return "WorkerRefMarket{" +
        "wId=" + wId +
        ", marketId=" + marketId +
        ", chatname=" + chatname +
        ", delflag=" + delflag +
        "}";
    }
}
