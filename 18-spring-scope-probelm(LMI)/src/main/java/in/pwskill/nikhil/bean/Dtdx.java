package in.pwskill.nikhil.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "dtdx")
@Scope("prototype")
public class Dtdx implements ICourior{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Dtdx []";
	}

}
