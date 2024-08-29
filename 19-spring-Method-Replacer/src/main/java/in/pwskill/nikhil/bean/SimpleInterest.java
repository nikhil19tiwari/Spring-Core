package in.pwskill.nikhil.bean;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;
@Component(value = "simpleInterestReplacer")
public class SimpleInterest implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        double p = (double) args[0];
        double r = (double) args[1];
        double t = (double) args[2];
System.out.println("simpleinterest");
        return (p * r * t) / 100;
    }
}
