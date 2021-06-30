package com.atxyj.srb.core.pojo.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author: xyj
 * @date: 2021/5/18
 */
@Data
public class ExcelDictDto {

    @ExcelProperty("id")
    private Long id ;

    @ExcelProperty("上级id")
    private Long parentId;

    @ExcelProperty("值")
    private Integer value;

    @ExcelProperty("编码")
    private String dictCode;
}
