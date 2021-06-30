package com.atxyj.srb.core.controller.admin;

import com.atxyj.common.exception.BusinessException;
import com.atxyj.common.result.R;
import com.atxyj.common.result.ResponseEnum;
import com.atxyj.srb.core.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: xyj
 * @date: 2021/5/18
 */
@Api(tags = "数据字典管理")
@RestController
@RequestMapping("/admin/core/dict")
@Slf4j
@CrossOrigin
public class AdminDictController {

    @Resource
    private DictService dictService;

    @ApiOperation("Excel数据的批量导入")
    @PostMapping("/import")
    public R batchImport(@ApiParam(value = "Excel数据字典文件" ,required = true)
                             @RequestParam("file")MultipartFile file) {
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
            dictService.importData(inputStream);
            return R.ok().message("数据字典导入成功!");
        } catch (IOException e) {
            throw new BusinessException(ResponseEnum.UPLOAD_ERROR, e);
         }


    }


}
