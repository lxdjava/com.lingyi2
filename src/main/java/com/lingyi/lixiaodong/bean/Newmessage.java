package com.lingyi.lixiaodong.bean;

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
@ApiModel(value="Newmessage对象", description="")
public class Newmessage extends Model<Newmessage> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String type;

    private Integer delflag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Newmessage{" +
        "id=" + id +
        ", type=" + type +
        ", delflag=" + delflag +
        "}";
    }
}
