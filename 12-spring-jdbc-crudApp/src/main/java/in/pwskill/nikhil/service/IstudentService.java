package in.pwskill.nikhil.service;
import in.pwskill.nikhil.bean.StudentDTO;

public interface IstudentService {
public String insertApp(StudentDTO dto);
public void selectApp(Integer sid,StudentDTO dto);
}
