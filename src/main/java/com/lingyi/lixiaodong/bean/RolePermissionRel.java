package com.lingyi.lixiaodong.bean;

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
@ApiModel(value="RolePermissionRel对象", description="")
public class RolePermissionRel extends Model<RolePermissionRel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rid", type = IdType.AUTO)
    private Long rid;

    private Long pid;


    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Override
    protected Serializable pkVal() {
        return this.rid;
    }

    @Override
    public String toString() {
        return "RolePermissionRel{" +
        "rid=" + rid +
        ", pid=" + pid +
        "}";
    }
}
