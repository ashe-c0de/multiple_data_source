package org.ashe.mapper.primary;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ashe.entity.Employees;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employees> {

    Employees selectOne();

}
