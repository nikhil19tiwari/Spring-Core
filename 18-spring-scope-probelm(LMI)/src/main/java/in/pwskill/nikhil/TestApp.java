package in.pwskill.nikhil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskill.nikhil.bean.Flipkart;
import in.pwskill.nikhil.config.AppConfig;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Flipkart f1 =  context.getBean("flipkart",Flipkart.class);
      System.out.println(f1);
        ((AbstractApplicationContext) context).close();
    }
}
