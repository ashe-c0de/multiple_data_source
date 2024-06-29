package org.ashe.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.ashe.entity.Employees;
import org.ashe.entity.User;
import org.ashe.mapper.primary.EmployeeMapper;
import org.ashe.mapper.secondary.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private EmployeeMapper employeeMapper;

    @Resource
    private UserMapper userMapper;

    public Object insertEmployee() {
        try {
            Employees employee = new Employees();
            employee.setName("小王");
            employee.setSalary(new BigDecimal("100.22"));
            employee.setHireDate(new Date());
            employeeMapper.insert(employee);
        } catch (Exception e) {
            log.error("insert process caught exception \n{}", e.getMessage(), e);
            return "no";
        }
        return "ok";
    }

    public Object query() {
        Map<String, Object> result = new HashMap<>();
        List<Employees> employees = employeeMapper.selectList(Wrappers.emptyWrapper());
        List<User> users = userMapper.selectList(Wrappers.emptyWrapper());
        Employees primaryOne = employeeMapper.selectOne();
        User user = userMapper.selectOne();
        result.put("employees", employees);
        result.put("users", users);
        result.put("primaryOne", primaryOne);
        result.put("user", user);
        return result;
    }

    public Object insertUser() {
        try {
            User user = new User();
            user.setName("Jack Ma");
            user.setAge(56);
            userMapper.insert(user);
        } catch (Exception e) {
            log.error("insert process caught exception \n{}", e.getMessage(), e);
            return "no";
        }
        return "ok";
    }
}
