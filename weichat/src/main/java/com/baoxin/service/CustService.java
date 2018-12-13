package com.baoxin.service;


import com.baoxin.pojo.Customer;

import java.util.List;


public interface CustService {

    public Customer save(Customer customer);

    public Customer update(Customer customer);

    List<Customer> findCustByName(String name);

    List<Customer> ListCustomer();

    public Customer checkCustomername(String name);

    public String checkCustomerPhone(String name);

    String Login(String username, String password);

    Customer checkCustomerPassword(String name,String phone);
}
