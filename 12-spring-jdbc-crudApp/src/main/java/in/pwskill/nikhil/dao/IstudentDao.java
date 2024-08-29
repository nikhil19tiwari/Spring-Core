package in.pwskill.nikhil.dao;

import in.pwskill.nikhil.bean.StudentBO;
public interface IstudentDao {
public String insertApp(StudentBO bo);
public void selectApp(Integer sid,StudentBO bo);
}
