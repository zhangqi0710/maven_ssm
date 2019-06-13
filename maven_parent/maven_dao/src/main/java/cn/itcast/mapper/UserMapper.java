package cn.itcast.mapper;

import cn.itcast.domain.User;

import java.util.List;

public interface UserMapper {
    /**
     * 判断用户是否存在
     * @param
     * @return
     */
    public User login(User user);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll();

    /**
     * 删除用户
     * @param id
     */
    public void delete(int id);

    /**
     * 注册用户
     * @param user
     */
    public void regist(User user);
}
