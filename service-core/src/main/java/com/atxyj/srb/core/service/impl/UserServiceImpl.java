package com.atxyj.srb.core.service.impl;

import com.atxyj.srb.core.pojo.entity.User;
import com.atxyj.srb.core.mapper.UserMapper;
import com.atxyj.srb.core.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 是否删除 服务实现类
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
