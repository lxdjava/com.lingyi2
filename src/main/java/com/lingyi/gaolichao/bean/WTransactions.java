package com.lingyi.gaolichao.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixiaodong
 * @since 2019-06-22
 */
@ApiModel(value="WTransactions对象", description="")
@Data
public class WTransactions extends Model<WTransactions> {

    private static final long serialVersionUID = 1L;

    private String wId;

    private String oId;

    private Double money;

    private Integer type;

    private Integer outOrIn;

    private Integer delflag;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
