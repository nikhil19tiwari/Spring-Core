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
   Employee emp1 = context.getBean("e1",Employee.class);
   Employee emp2 = context.getBean("e1",Employee.class);
   System.out.println(emp1 == emp2);
   System.out.println(emp1.hashCode());
   System.out.println(emp2.hashCode());
   
   
   Employee emp3 = context.getBean("e1",Employee.class);
   Employee emp4 = context.getBean("e2",Employee.class);
   System.out.println(emp3 == emp4);
   System.out.println(emp3.hashCode());
   System.out.println(emp4.hashCode());
   
   Printer p1obj = context.getBean("p1",Printer.class);
   Printer p2obj = context.getBean("p2",Printer.class);
   System.out.println(p1obj == p2obj);
   System.out.println(p1obj.hashCode());
   System.out.println(p2obj.hashCode());
   ((AbstractApplicationContext) context).close();
    }
}
