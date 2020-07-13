package Springtest.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("application-annotation.xml");
        Calculator calculator = act.getBean(Calculator.class);

        int result = calculator.add(1,3);
        System.out.println("result = "+result);
    }
}
