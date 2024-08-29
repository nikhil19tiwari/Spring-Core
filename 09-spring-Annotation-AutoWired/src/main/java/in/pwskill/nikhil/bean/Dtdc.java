package in.pwskill.nikhil.bean;

import org.springframework.stereotype.Component;

@Component(value = "dtdc")
public class Dtdc implements Icoriour{

	@Override
	public void process() {
System.out.println("this is from Dtdc");
		
	}

}
