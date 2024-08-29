package in.pwskill.nikhil.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "ecart")
@Scope("prototype")
public class Ecart implements ICourior {

	@Override
	public String toString() {
		return "Ecart []";
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

}
