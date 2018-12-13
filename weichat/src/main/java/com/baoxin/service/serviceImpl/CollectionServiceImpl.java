/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CollectionServiceImpl
 * Author:   hasee
 * Date:     2018/11/22 8:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.service.serviceImpl;


import com.baoxin.dao.CollMapper;
import com.baoxin.pojo.Coll;
import com.baoxin.service.CollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/22
 * @since 1.0.0
 */
@Service
public class CollectionServiceImpl implements CollectionService {

    private final Logger LOGGER = LoggerFactory.getLogger(CollectionServiceImpl.class);

    @Autowired
    CollMapper collMapper;

    @Override
    public Coll save(Coll coll) {
        collMapper.insert(coll);
        return coll;
    }

    @Override
    public void delete(Integer id) {
        collMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Coll selete(Integer id) {
        return collMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Coll> listAllColl() {
        return collMapper.listAllColl();
    }
}

