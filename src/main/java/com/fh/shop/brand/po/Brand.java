package com.fh.shop.brand.po;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;

import java.io.Serializable;
@Data
@TableName("t_brand")
public class Brand implements Serializable {
    private static final long serialVersionUID = 2011031871580837660L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField("brandName")
    private String brandName;
}
