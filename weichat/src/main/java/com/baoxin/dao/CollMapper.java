package com.baoxin.dao;

import com.baoxin.pojo.Coll;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Coll record);

    int insertSelective(Coll record);

    Coll selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Coll record);

    int updateByPrimaryKey(Coll record);

    List<Coll> listAllColl();

}
