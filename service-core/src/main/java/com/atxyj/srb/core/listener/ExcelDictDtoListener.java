package com.atxyj.srb.core.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.atxyj.srb.core.mapper.DictMapper;
import com.atxyj.srb.core.pojo.dto.ExcelDictDto;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xyj
 * @date: 2021/5/18
 */
@Slf4j
@NoArgsConstructor
public class ExcelDictDtoListener extends AnalysisEventListener<ExcelDictDto> {

    //数据列表
    List<ExcelDictDto> list = new ArrayList<>();

    //每隔五条数据存储一次数据
    private static final int BATCH_COUNT = 5;

    private DictMapper dictMapper;

    public ExcelDictDtoListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    @Override
    public void invoke(ExcelDictDto data, AnalysisContext analysisContext) {
        log.info("解析到一条记录:{}" , data );
        //将数据存入数据列表
        list.add(data);
        if(list.size()>=BATCH_COUNT) {
            //调用mapper层的save()方法
            saveData();
            list.clear();
        }


    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //当最后剩余的数据记录数不足BATCH_COUNT时，我们最终一次性存储剩余数据
        saveData();
        log.info("所有数据解析完成！");
    }

    private void saveData() {
        log.info("{}条数据被存储到数据库......" , list.size());
        //调用mapper层的save()方法 save list对象
        //TODO
        dictMapper.insertBatch();
        log.info("{}条数据被存储到数据库成功！" , list.size());
    }
}
