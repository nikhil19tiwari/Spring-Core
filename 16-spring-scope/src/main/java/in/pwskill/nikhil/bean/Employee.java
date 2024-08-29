package in.pwskill.nikhil.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {
    @Value("${info.emp.eid}")
    private Integer eid;
    
    @Value("${info.emp.ename}")
    private String ename;
    
    @Value("${info.emp.eage}")
    private Integer eage;
    
    @Value("${info.emp.eaddress}")
    private String eaddress;

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
    }
}
