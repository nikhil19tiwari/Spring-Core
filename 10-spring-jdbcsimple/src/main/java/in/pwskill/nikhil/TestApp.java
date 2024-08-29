package in.pwskill.nikhil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import in.pwskill.nikhil.bean.StudentImpl;
import in.peskill.nikhil.config.AppConfig;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentImpl ss = context.getBean("mysqlDao", StudentImpl.class);
        ss.getConnection();
        ((AbstractApplicationContext) context).close();
    }
}
