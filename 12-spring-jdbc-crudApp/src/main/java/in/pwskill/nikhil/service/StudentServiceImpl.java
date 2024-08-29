package in.pwskill.nikhil.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentBO;
import in.pwskill.nikhil.bean.StudentDTO;
import in.pwskill.nikhil.dao.IstudentDao;
@Component("service")
public class StudentServiceImpl  implements IstudentService{
	@Autowired
private IstudentDao dao;
	@Override
	public String insertApp(StudentDTO dto) {
		//converting DTO into BO object
		StudentBO bo = new StudentBO();
		bo.setPmt(dto.getPmt());
		bo.setSname(dto.getSname());
		bo.setRate(dto.getRate());
		bo.setSid(dto.getSid());
		bo.setTime(dto.getTime());
		// Business logic
        Integer si = (dto.getPmt() * dto.getRate() * dto.getTime()) / 100;
        bo.setSi(si);

		return dao.insertApp(bo);
	}
	@Override
	public void selectApp(Integer sid, StudentDTO dto) {
		//converting DTO into BO object
	    StudentBO bo = new StudentBO();
	    bo.setSid(sid);
	    dao.selectApp(sid, bo);
	}

}
