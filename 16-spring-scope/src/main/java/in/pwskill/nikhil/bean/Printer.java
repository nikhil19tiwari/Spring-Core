package in.pwskill.nikhil.bean;

public class Printer {
    static {
        System.out.println("Printer class is loaded");
    }

    private static Printer instance = null;

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    private Printer() {
        System.out.println("Printer object is created");
    }
}
