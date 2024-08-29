package in.pwskill.nikhil.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Employee {
@Scheduled(cron = "1 * * * * *")
public void process() {
	System.out.println("tring tring !!!...");
}
}
