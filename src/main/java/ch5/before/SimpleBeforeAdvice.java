package ch5.before;

import ch5.MassageWriter;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleBeforgeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName());
    }

    public static void main(String[] args) {
        MassageWriter target = new MassageWriter();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleBeforeAdvice());
        pf.setTarget(target);
        MassageWriter proxy = (MassageWriter) pf.getProxy();
        proxy.writeMassage();
    }
}
