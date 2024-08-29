package in.pwskill.nikhil.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value ="fedex")
@Primary
public class Fedex implements Icoriour{

	@Override
	public void process() {

System.out.println("this is from fedex");
		
	}

}
