package com.ygsoft.xiekang.dao;

import java.util.List;

import com.ygsoft.xiekang.model.Kstable;


public interface XiekangDAO  {
    
    public void insertData(Kstable insertData);
    
    public void updataData(Kstable updataData);
    
    public void deleteData(Kstable deleteData);
    
    public List<Kstable> selectData(String sql);
    
    public List<Kstable> selectAll();
}
