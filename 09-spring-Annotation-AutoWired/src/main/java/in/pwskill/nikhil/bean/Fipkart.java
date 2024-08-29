package in.pwskill.nikhil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
public class Fipkart {
	@Autowired
	//@Qualifier(value ="ekart")
    private Icoriour courior;

	@Override
	public String toString() {
		return "Fipkart [courior=" + courior + "]";
	}



}
