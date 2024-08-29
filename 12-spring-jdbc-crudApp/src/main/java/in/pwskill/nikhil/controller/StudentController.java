package in.pwskill.nikhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentDTO;
import in.pwskill.nikhil.bean.StudentVO;
import in.pwskill.nikhil.service.IstudentService;

@Component("controller")
public class StudentController {


    @Autowired
    private IstudentService service;

    public String insertApp(StudentVO vo) {
        // creating the DTO object
        StudentDTO dto = new StudentDTO();

        // converting VO object into DTO object
        dto.setPmt(Integer.parseInt(vo.getPmt()));
        dto.setRate(Integer.parseInt(vo.getRate()));
        dto.setSid(Integer.parseInt(vo.getSid()));
        dto.setSname(vo.getSname());
        dto.setTime(Integer.parseInt(vo.getTime()));

        return service.insertApp(dto);
    }

    public void selectApp(Integer sid, StudentVO vo) {
    	StudentDTO dto = new StudentDTO();
        service.selectApp(sid, dto);
    }
}
