package Springtest.aop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    @Override
    public double div(int a, int b) {
        double result = a / b;
        return 0;
    }
}
