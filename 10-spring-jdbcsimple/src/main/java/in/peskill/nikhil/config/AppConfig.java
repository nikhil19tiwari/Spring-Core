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
@ComponentScan(basePackages = "in.pwskill.nikhil")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean(value ="ds")
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("info.std.url"));
        dataSource.setUsername(environment.getProperty("info.std.user"));
        dataSource.setPassword(environment.getProperty("info.std.password"));
        return dataSource;
    }
}
