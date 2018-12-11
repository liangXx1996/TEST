package com.baosight.dao;

import com.baosight.VO.ShoppingCarVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopCarVOMapper {

    List<ShoppingCarVO> shopCarSelete();
}
