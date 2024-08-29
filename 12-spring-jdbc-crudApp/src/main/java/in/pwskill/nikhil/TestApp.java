package in.pwskill.nikhil;

import in.peskill.nikhil.config.AppConfig;
import in.pwskill.nikhil.bean.StudentVO;
import in.pwskill.nikhil.controller.StudentController;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApp {

    public static void main(String[] args) throws InterruptedException {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
             Scanner sc = new Scanner(System.in)) {

  System.out.println("Hey nikhil ");
            Thread.sleep(1000);

            System.out.println("Press 1 for INSERT ::");
            System.out.println("Press 2 for SELECT ::");
            System.out.println("Press 3 for UPDATE ::");
            System.out.println("Press 4 for DELETE ::");
            int num = sc.nextInt();

            // Creating the StudentVO object
            StudentVO vo = new StudentVO();
            String sid = null;
            if (num == 1) {
                System.out.println("Enter the Student id:");
                String id = sc.next();

                System.out.println("Enter the Student name:");
                String name = sc.next();

                System.out.println("Enter the Student pmt:");
                String pmt = sc.next();

                System.out.println("Enter the Student rate:");
                String rate = sc.next();

                System.out.println("Enter the Student time:");
                String time = sc.next();

                vo.setPmt(pmt);
                vo.setRate(rate);
                vo.setSid(id);
                vo.setTime(time);
                vo.setSname(name);
            } else if (num == 2) {
                System.out.print("OK SO, Enter the sid ::");
                sid = sc.next();
            }

            StudentController controller = context.getBean("controller", StudentController.class);
            if (num == 1) {
                String status = controller.insertApp(vo);
            System.out.println(status);
            } else if (num == 2) {
            	
                Integer kk = Integer.parseInt(sid);
                controller.selectApp(kk, vo);
            }
        }
    }
}
