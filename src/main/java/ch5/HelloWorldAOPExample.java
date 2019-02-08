package ch5;

import org.springframework.aop.framework.ProxyFactory;

public class HelloWorldAOPExample {
    public static void main(String[] args) {
        MassageWriter target = new MassageWriter();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MassageDecorator());
        pf.setTarget(target);

        MassageWriter proxy = (MassageWriter) pf.getProxy();
        target.writeMassage();
        proxy.writeMassage();
    }
}
