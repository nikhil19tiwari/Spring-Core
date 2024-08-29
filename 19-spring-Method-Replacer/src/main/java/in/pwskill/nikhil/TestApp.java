package in.pwskill.nikhil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.pwskill.nikhil.bean.TextMessage;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextMessage t1 = context.getBean( TextMessage.class);
        t1.process(10000, 2, 6);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
