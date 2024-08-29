package in.pwskill.nikhil.bean;

import org.springframework.stereotype.Component;

@Component(value ="ekart")
public class Ekart implements Icoriour {

	@Override
	public void process() {
System.out.println("this is from Ekart");
	}

}
