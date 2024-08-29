package in.pwskill.nikhil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.pwskill.nikhil.bean.Printer;

@Configuration
@ComponentScan(basePackages = "in.pwskill.nikhil")
public class AppConfig {
    static {
        System.out.println("AppConfig class is loaded");
    }

    public AppConfig() {
        System.out.println("AppConfig class object is created");
    }

    @Bean(name = "p1")
    public Printer getPrinterInstance1() {
        return Printer.getInstance();
    }
    @Bean(name = "p2")
    public Printer getPrinterInstance2() {
        return Printer.getInstance();
    }
}
