package Springtest.annotation.Controller;

import Springtest.annotation.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DeptController {

    @Autowired
    DeptService service;

    public void doSave(){
        System.out.println("DeptController doSave()......");
        service.doSave();
    }
}
