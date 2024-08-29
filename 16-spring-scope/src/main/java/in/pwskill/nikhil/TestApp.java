package in.pwskill.nikhil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskill.nikhil.bean.Employee;
import in.pwskill.nikhil.bean.Printer;
import in.pwskill.nikhil.config.AppConfig;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee obj1 = context.getBean("employee", Employee.class);
        Employee obj2 = context.getBean("employee", Employee.class);
        
        System.out.println(obj1 == obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode()); // Eager Loading

        Printer p1obj = context.getBean("p1", Printer.class);
        Printer p2obj = context.getBean("p1", Printer.class);
        
        System.out.println(p1obj == p2obj);
        Printer p3obj = context.getBean("p1",Printer.class);
        Printer p4obj = context.getBean("p2",Printer.class);
         System.out.println(p3obj == p4obj);
         System.out.println(p3obj.hashCode());
         System.out.println(p4obj.hashCode());
        ((AbstractApplicationContext) context).close();
    }
}
