/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CustServiceImpl
 * Author:   hasee
 * Date:     2018/11/20 15:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.baosight.service.serviceImpl;

import com.baosight.dao.CustomerMapper;
import com.baosight.pojo.Customer;
import com.baosight.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/20
 * @since 1.0.0
 */

@Service
public class CustServiceImpl implements CustService {

   @Autowired
   CustomerMapper customerMapper;

    @Override
    public Customer save(Customer customer) {
        String phone = customerMapper.checkCustomerPhone(customer.getName());
        if(phone == null){
            customerMapper.insert(customer);
            return customer;
        }
       return null;
    }

    @Override
    public Customer update(Customer customer) {
        Customer customername = customerMapper.checkCustomername(customer.getName());
        if (customername == null) {
            return null;
        }
            else {
                customerMapper.updateByPrimaryKeySelective(customer);
                return customer;
            }
        }

    @Override
    public List<Customer> findCustByName(String name) {
        return customerMapper.findCustByName(name);
    }

    @Override
    public List<Customer> ListCustomer() {
        return customerMapper.ListCustomer();
    }

   @Override
    public String Login(String name, String password) {
//       Customer customername = customerMapper.checkCustomername(name);
//       Customer c = customerMapper.ByPassword(password);
       String c1 = customerMapper.selectLogin(name, password);
        /*if(customername == null){
            return null;
        }else if (c == null) {
            return null;
        }else */
        if (c1 == null) {
            return "err";
       }
       return c1;
    }

    @Override
    public Customer checkCustomername(String name) {
        return customerMapper.checkCustomername(name);
    }

    @Override
    public String checkCustomerPhone(String name) {
        return customerMapper.checkCustomerPhone(name);
    }

    @Override
    public Customer checkCustomerPassword(String name,String phone) {

        return customerMapper.checkPassword(name, phone);
    }
}


