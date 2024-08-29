package in.pwskill.nikhil;

import in.peskill.nikhil.config.AppConfig;
import in.pwskill.nikhil.bean.StudentVO;
import in.pwskill.nikhil.controller.StudentController;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestApp {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey Nikhil !!!");
        Thread.sleep(1000);

        System.out.println("Enter the Student id:");
        String id = sc.next();

        System.out.println("Enter the Student name:");
        String name = sc.next();

        System.out.println("Enter the Student age:");
        String age = sc.next();

        System.out.println("Enter the Student address:");
        String address = sc.next();

        System.out.println("Enter the Student pmt:");
        String pmt = sc.next();

        System.out.println("Enter the Student rate:");
        String rate = sc.next();

        System.out.println("Enter the Student time:");
        String time = sc.next();

        // Creating the StudentVO object
        StudentVO vo = new StudentVO();
        vo.setPmt(pmt);
        vo.setRate(rate);
        vo.setSaddress(address);
        vo.setSage(age);
        vo.setSid(id);
        vo.setTime(time);
        vo.setSname(name);

        StudentController controller = context.getBean("controller", StudentController.class);
        String status = controller.insertApp(vo);
        System.out.println(status);

        ((AbstractApplicationContext) context).close();
        sc.close();
    }
}
