package com.atxyj.srb.core.controller.admin;


import com.atxyj.common.exception.Assert;
import com.atxyj.common.exception.BusinessException;
import com.atxyj.common.result.R;
import com.atxyj.common.result.ResponseEnum;
import com.atxyj.srb.core.pojo.entity.IntegralGrade;
import com.atxyj.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@CrossOrigin //进行跨域,前后端联调
@RestController
@Api("积分等级管理")
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public R listAll () {
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list" , list).message("获取列表成功");
    }

    @ApiOperation(value = "根据id删除数据记录" ,notes = "逻辑删除数据记录")
    @DeleteMapping("/remove/{id}")
    public R removeById(@ApiParam(value = "数据id" , example = "100" ,required = true)  @PathVariable Long id) {
        boolean b = integralGradeService.removeById(id);
        if(b){
            return R.ok().message("删除成功");
        } else {
            return R.error().message("删除失败");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(@ApiParam(value = "积分等级对象" , required = true) @RequestBody IntegralGrade integralGrade) {
        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        boolean save = integralGradeService.save(integralGrade);
        if(save) {
            return R.ok().message("保存成功");
        } else {
            return R.error().message("保存失败");
        }
    }

    @ApiOperation("根据id获取积分")
    @GetMapping("/get/{id}")
    public R getById(@ApiParam(value = "数据id" ,required = true , example = "") @PathVariable Long id) {
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade != null) {
            return R.ok().data("record" , integralGrade);
        } else {
            return R.error().message("数据获取失败");
        }
    }

    @ApiOperation("修改积分等级")
    @PutMapping("/update")
    public R update(@ApiParam(value = "数据id" ,required = true , example = "")  @RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.updateById(integralGrade);
        if(result) {
            return R.ok().message("更新成功");
        } else {
            return R.error().message("更新失败");
        }
    }

}

