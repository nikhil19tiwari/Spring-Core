package in.pwskill.nikhil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskill.nikhil.bean.Employee;

import in.pwskill.nikhil.config.AppConfig;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
         
    }
}
