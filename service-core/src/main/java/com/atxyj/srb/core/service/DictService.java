package com.atxyj.srb.core.service;

import com.atxyj.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
public interface DictService extends IService<Dict> {
    /**
     * 导入数据
     * @param inputStream
     */
    void importData(InputStream inputStream);

}
