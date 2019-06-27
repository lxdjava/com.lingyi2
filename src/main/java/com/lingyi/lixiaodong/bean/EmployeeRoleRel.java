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
@ApiModel(value="EmployeeRoleRel对象", description="")
public class EmployeeRoleRel extends Model<EmployeeRoleRel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "eid", type = IdType.AUTO)
    private Long eid;

    private Long rid;


    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    @Override
    protected Serializable pkVal() {
        return this.eid;
    }

    @Override
    public String toString() {
        return "EmployeeRoleRel{" +
        "eid=" + eid +
        ", rid=" + rid +
        "}";
    }
}
