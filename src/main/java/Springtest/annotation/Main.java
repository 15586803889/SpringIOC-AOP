package Springtest.annotation;

import Springtest.annotation.Controller.DeptController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("annotation.xml");
        DeptController controller = (DeptController) act.getBean("deptController");
        System.out.println(controller);

        controller.doSave();
    }
}
