package in.pwskill.nikhil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentBO;
import in.pwskill.nikhil.bean.StudentDTO;
import in.pwskill.nikhil.dao.Istudentdao;

@Component("service")
public class StudentserviceImpl implements Istudentservice {
    @Autowired
    private Istudentdao dao;

    @Override
    public String insertApp(StudentDTO dto) {
        StudentBO bo = new StudentBO();
        bo.setSid(dto.getSid());
        bo.setSname(dto.getSname());
        bo.setSage(dto.getSage());
        bo.setSaddress(dto.getSaddress());
        bo.setPmt(dto.getPmt());
        bo.setRate(dto.getRate());
        bo.setTime(dto.getTime());

        // Business logic
        Integer si = (dto.getPmt() * dto.getRate() * dto.getTime()) / 100;
        bo.setSi(si);

        return dao.insertApp(bo);
    }
}
