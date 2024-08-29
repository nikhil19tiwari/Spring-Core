package in.pwskill.nikhil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "flipkart")
public class Flipkart{
//	
//	@Autowired
//	@Qualifier("fedex")	
//@Value("#{ekart}") === @Autowired + @Qualifier("ekart")
	@Value("#{ecart}")
private ICourior courior;
	@Override
	public String toString() {
		return "Fipkart [courior=" + courior + "]";
	}


}
