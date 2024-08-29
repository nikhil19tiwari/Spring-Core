package in.pwskill.nikhil.bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
@PropertySource("classpath:application.properties")
public class Employee {
    @Value("${info.emp.id}")
    private Integer id;
    
    @Value("${info.emp.name}")
    private String name;
    
    @Value("${info.emp.age}")
    private Integer age;
    
    @Value("${info.emp.address}")
    private String address;

    @Autowired(required = false)
    private LocalDateTime ldt;
    
    @Autowired(required = false)
    private Set<Long> phoneNumber;
    
    @Autowired(required = false)
    private List<String> friends;
    
    @Autowired(required = false)
    private Map<String, Integer> bankAccounts;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", ldt=" + ldt
                + ", phoneNumber=" + phoneNumber + ", friends=" + friends + ", bankAccounts=" + bankAccounts + "]";
    }
}
