package com.baoxin.service;

import com.baoxin.pojo.Coll;

import java.util.List;

public interface CollectionService {

    public Coll save(Coll coll);

    public void delete(Integer id);

    public Coll selete(Integer id);

    List<Coll> listAllColl();

}
