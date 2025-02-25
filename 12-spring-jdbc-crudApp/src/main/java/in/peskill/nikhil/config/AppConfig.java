package in.peskill.nikhil.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@PropertySource("application.properties")
@ComponentScan(basePackages = "in.pwskill.nikhil")
public class AppConfig {

    @Autowired
    private Environment environment;

    static {
        System.out.println("AppConfig class loaded ...");
    }

    public AppConfig() {
        System.out.println("AppConfig object created ...");
    }

    @Bean

    public DataSource dataSource() {

    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("info.std.url"));
        dataSource.setUsername(environment.getProperty("info.std.user"));
        dataSource.setPassword(environment.getProperty("info.std.password"));
        return dataSource;
    
    }
}
