package com.atxyj.srb.core.mapper;

import com.atxyj.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch();
}
