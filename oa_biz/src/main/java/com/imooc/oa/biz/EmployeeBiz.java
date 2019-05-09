package com.imooc.oa.biz;

import com.imooc.oa.entity.Employee;

import java.util.List;

public interface EmployeeBiz {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee select(String sn);
    List<Employee> getAll();
    List<Employee> selectByDepartmentAndPost(String dsn,String post);
}
