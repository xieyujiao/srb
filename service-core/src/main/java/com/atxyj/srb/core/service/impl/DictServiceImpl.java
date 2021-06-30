package com.atxyj.srb.core.service.impl;

import com.alibaba.excel.EasyExcel;
import com.atxyj.srb.core.listener.ExcelDictDtoListener;
import com.atxyj.srb.core.pojo.dto.ExcelDictDto;
import com.atxyj.srb.core.pojo.entity.Dict;
import com.atxyj.srb.core.mapper.DictMapper;
import com.atxyj.srb.core.service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@Slf4j
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void importData(InputStream inputStream) {
        EasyExcel.read(inputStream, ExcelDictDto.class, new ExcelDictDtoListener(baseMapper)).sheet().doRead();
        log.info("数据导入成功！");
    }
}
