package in.pwskill.nikhil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.peskill.nikhil.config.AppConfig;
import in.pwskill.nikhil.bean.Employee;
public class TestApp {
//DI through setter
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = context.getBean("employee",Employee.class);
		employee.process("nikhil");
		((AbstractApplicationContext) context).close();
	}

}
