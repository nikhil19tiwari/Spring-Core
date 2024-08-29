package in.pwskill.nikhil.bean;

import org.springframework.stereotype.Component;

@Component(value = "fedex")
public class Fedex implements ICourior{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("this is from Fedx");
	}

}
