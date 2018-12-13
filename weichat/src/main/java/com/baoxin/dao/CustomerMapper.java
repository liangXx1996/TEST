package com.baoxin.dao;

import com.baoxin.pojo.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer customer);

    int updateByPrimaryKey(Customer customer);

    Customer checkCustomername(@Param("name")String name);

    Customer checkPassword(@Param("name") String name,@Param("phone") String phone);

    String selectLogin(@Param("name")String name,@Param("password") String password);

    Customer ByPassword(@Param("password") String password);

    List<Customer> findCustByName(@Param("name")String name);

    public List<Customer> ListCustomer();

    String checkCustomerPhone(@Param("name")String name);
}