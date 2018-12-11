/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CollectionController
 * Author:   hasee
 * Date:     2018/11/22 9:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baosight.crotroller;

import com.baosight.pojo.Coll;
import com.baosight.service.serviceImpl.CollectionServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/22
 * @since 1.0.0
 */
@RestController
public class CollectionController {
//    private  final Logger LOGGER = LoggerFactory.getLogger(CollectionController.class);

    @Autowired
    CollectionServiceImpl collectionService;

    @RequestMapping(value = "/cust/Coll/Insert",method = RequestMethod.POST)
    public Coll insert(@RequestBody Coll coll){
        collectionService.save(coll);
        return coll;
    }

    @RequestMapping("/cust/Coll/Delete")
    public void delete(Integer id){
        collectionService.delete(id);
    }

    @RequestMapping("/cust/Coll/Selete")
    public Coll selete(Integer id){
        return collectionService.selete(id);
    }

    @RequestMapping("/cust/Coll/listAllColl")
    public void listAllColl(){
        collectionService.listAllColl();
    }
}

