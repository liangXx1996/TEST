package com.baoxin.dao;

import com.baoxin.VO.ShoppingCarVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopCarVOMapper {

    List<ShoppingCarVO> shopCarSelete();
}
