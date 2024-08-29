package in.pwskill.nikhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentDTO;
import in.pwskill.nikhil.bean.StudentVO;
import in.pwskill.nikhil.service.Istudentservice;

@Component("controller")
public class StudentController {
    @Autowired
    private Istudentservice service;

    public String insertApp(StudentVO vo) {
        StudentDTO dto = new StudentDTO();
        dto.setSid(Integer.parseInt(vo.getSid()));
        dto.setSname(vo.getSname());
        dto.setSage(Integer.parseInt(vo.getSage()));
        dto.setSaddress(vo.getSaddress());
        dto.setPmt(Integer.parseInt(vo.getPmt()));
        dto.setRate(Integer.parseInt(vo.getRate()));
        dto.setTime(Integer.parseInt(vo.getTime()));
        return service.insertApp(dto);
    }
}
