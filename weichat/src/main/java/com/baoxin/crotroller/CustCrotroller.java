/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CustCrotroller
 * Author:   hasee
 * Date:     2018/11/20 15:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.crotroller;



import com.baoxin.pojo.Customer;
import com.baoxin.service.serviceImpl.CustServiceImpl;
import com.baoxin.util.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/20
 * @since 1.0.0
 */
@RestController
public class CustCrotroller {

    @Autowired
    CustServiceImpl custService;

    /*
    注册
     */

    @RequestMapping(value = "/custInsert")
    public Customer insert(@RequestBody Customer customer){
        Customer customer1 = custService.checkCustomername(customer.getName());
        Customer save = custService.save(customer);
        if (customer1 == null){
            System.out.println("用户不存在,新注册的用户:"+save);
            return save;
        }
        System.out.println("用户已经存在:"+customer1);
        return null;
    }

    /*
    查找
     */

    @RequestMapping("/custfindCustByName")
      public List<Customer> findUserByName(@RequestBody Customer name){
        return custService.findCustByName(name.getName());
    }

    /*
    查找所有用户
     */
    @RequestMapping("/cust/listCustomer")
    public List<Customer> ListCustomer(){
        return custService.ListCustomer();
    }

    /*
    登录
     */

    @RequestMapping(value = "/custLogin",method = RequestMethod.POST)
    public String login(@RequestBody Customer customer,
                          HttpServletResponse response){
        System.out.println(customer.getPassword());
        System.out.println(customer.getName());

        String login = custService.Login(customer.getName(),customer.getPassword());
        if (login == "err"){
            System.out.println(login);
            return "err";
        }
        System.out.println("login:"+login);
        String jwt = JwtHelper.createJWT(customer.getName(),customer.getPassword(), "xxx", "author", 57955554L, "signingKey");
        response.setHeader("Access-Control-Expose-Headers","Authorization");
        response.setHeader("Authorization","bearer;"+jwt);
        System.out.println(jwt);
        return "";
    }

    /**
     *改密，余额。。。
     */
    //raw,username在最后当条件
    @RequestMapping(value = "/cust/custUpdate",method = RequestMethod.POST)
    public Customer update(@RequestBody Customer customer){
        custService.update(customer);
        System.out.println(customer);
        return customer;
    }
    /*
    检查
     */

    @RequestMapping(value = "/cust/checkByName",method = RequestMethod.POST)
    public Customer check(@RequestBody Customer customer){
        return custService.checkCustomername(customer.getName());
    }
    /*
    检查
     */

    @RequestMapping("/cust/checkCustomerPhone")
    public String check1(@RequestBody Customer customer){
        return custService.checkCustomerPhone(customer.getName());
    }

    @RequestMapping("/cust/checCustPassword")
    public Customer check2(@RequestBody Customer customer){
       return custService.checkCustomerPassword(customer.getName(),customer.getPhone());
    }
}

