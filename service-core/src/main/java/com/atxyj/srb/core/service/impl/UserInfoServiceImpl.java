package com.atxyj.srb.core.service.impl;

import com.atxyj.srb.core.pojo.entity.UserInfo;
import com.atxyj.srb.core.mapper.UserInfoMapper;
import com.atxyj.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
