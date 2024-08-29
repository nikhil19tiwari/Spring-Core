package in.peskill.nikhil.config;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.pwskill.nikhil")
public class AppConfig {
    static {
        System.out.println("AppConfig class loading");
    }

    public AppConfig() {
        System.out.println("AppConfig object created");
    }

    @Bean(name = "con")
    public LocalDateTime ldt() {
        return LocalDateTime.now();
    }

    @Bean(name = "phoneNumbers")
    public Set<Long> se() {
        Set<Long> set = Set.of(11111111L, 2222222L, 3333333L);
        return set;
    }

    @Bean(name = "friendsList")
    public List<String> lis() {
        List<String> list = List.of("nikhil", "vivek", "ankit");
        return list;
    }

    @Bean(name = "bankAccountsMap")
    public Map<String, Integer> m() {
        Map<String, Integer> map = Map.of("SBI", 2344, "BOB", 2435);
        return map;
    }
}
