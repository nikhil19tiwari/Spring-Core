package in.pwskill.nikhil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "flipkart")
@Scope("singleton")
//@Scope("prototype")
public class Flipkart {
	
	@Autowired
	@Qualifier("fedex")
private ICourior courior;

	public ICourior getCourior() {
		courior = getCouriorObj();
		return courior;
	}
	@Lookup(value = "fedex")
	private ICourior getCouriorObj() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Flipkart [courior=" + courior + "]";
	}
	
}
