package com.baomidou.mp.service.impl;

import com.baomidou.mp.entity.User;
import com.baomidou.mp.mapper.UserMapper;
import com.baomidou.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hasee
 * @since 2018-12-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
