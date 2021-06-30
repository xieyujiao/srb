package com.atxyj.srb.core.service.impl;

import com.atxyj.srb.core.pojo.entity.Product;
import com.atxyj.srb.core.mapper.ProductMapper;
import com.atxyj.srb.core.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
