package in.pwskill.nikhil.bean;

import org.springframework.stereotype.Component;

@Component("textmessage")
public class TextMessage {
    public void process(double p, double r, double t) {
        System.out.println("Good morning brother, don't start your day"
                + " by dumbing yourself down with the stupid reels");
    }
}
