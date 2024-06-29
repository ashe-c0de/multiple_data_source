package org.ashe.mapper.secondary;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ashe.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectOne();
}
