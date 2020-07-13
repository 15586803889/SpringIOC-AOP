package Springtest.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DeptDao {

    public void doSave(){
        System.out.println("Dao doSave()......");
    }

}
