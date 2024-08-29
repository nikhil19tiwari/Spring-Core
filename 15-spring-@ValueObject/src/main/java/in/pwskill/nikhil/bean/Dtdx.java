package in.pwskill.nikhil.bean;

import org.springframework.stereotype.Component;

@Component(value="dtdx")
public class Dtdx implements ICourior{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("this is from dtdx");
	}

}
