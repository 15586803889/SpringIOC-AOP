package Springtest.annotation.service;

import Springtest.annotation.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    DeptDao dao;

    public void doSave(){
        System.out.println("deptService doSave()......");
        dao.doSave();
    }
}
