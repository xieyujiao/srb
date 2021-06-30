package com.atxyj.srb.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Product对象", description="商品表")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "价格")
    private Integer price;

    @ApiModelProperty(value = "乐观锁版本号")
    private Integer version;


}
