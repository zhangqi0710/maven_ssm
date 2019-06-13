package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 判断用户是否存在
     * @param
     * @return
     */
    @Override
    public User login(User user1) {
        User user = userMapper.login(user1);
        return user;
    }


    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findAll() {
        PageHelper.startPage(1,8);
        List<User> userList = userMapper.findAll();
        return userList;
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void regist(User user) {
        userMapper.regist(user);
    }
}
