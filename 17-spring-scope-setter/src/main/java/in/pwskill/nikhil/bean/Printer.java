package in.pwskill.nikhil.bean;

public class Printer {
static {
	System.out.println("Printer object is created");
}

private static Printer Instence  = null;
public static Printer getIntence() {
	if(Instence == null) {
		Instence = new Printer();
	}
	return Instence; 
}

}
