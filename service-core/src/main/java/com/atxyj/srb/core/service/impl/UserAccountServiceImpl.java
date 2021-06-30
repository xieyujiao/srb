package com.atxyj.srb.core.service.impl;

import com.atxyj.srb.core.pojo.entity.UserAccount;
import com.atxyj.srb.core.mapper.UserAccountMapper;
import com.atxyj.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author xyj
 * @since 2021-04-27
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
