package pwskill.in.pwskill.nikhil.spring.core;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new AnnotationConfigApplicationContext(empConfig.class);
    	Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
		
		//close the container
		((AbstractApplicationContext) context).close();

    }
}
