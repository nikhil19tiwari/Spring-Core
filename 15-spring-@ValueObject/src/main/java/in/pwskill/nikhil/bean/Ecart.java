package in.pwskill.nikhil.bean;

import org.springframework.stereotype.Component;

@Component(value="ecart")
public class Ecart implements ICourior{

	@Override
	public void process() {

System.out.println("this is from Ecart");
		
	}

}
