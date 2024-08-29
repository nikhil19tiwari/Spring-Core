package in.pwskill.nikhil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentBO;


@Component("dao")
public class StudentDaoImpl implements IstudentDao {
    private static final String SQL_INSERT_QUERY = "insert into spingcrud values(?,?,?,?,?,?)";
    private static final String SQL_SELECT_QUERY = "select * from spingcrud where sid = ?";

    @Autowired
    private DataSource ds;

    @Override
    public String insertApp(StudentBO bo) {
    	 int count = 0;
        try (Connection connection = ds.getConnection();
             PreparedStatement pstm = connection.prepareStatement(SQL_INSERT_QUERY)) {
            pstm.setInt(1, bo.getSid());
            pstm.setString(2, bo.getSname());
            pstm.setInt(3, bo.getPmt());
            pstm.setInt(4, bo.getRate());
            pstm.setInt(5, bo.getTime());
            pstm.setInt(6, bo.getSi());

            count = pstm.executeUpdate();

        } catch (SQLException e) {
e.printStackTrace();
        }
        return count == 1 ? "Record inserted Successfully" : "Record not inserted";
    }

    @Override
    public void selectApp(Integer sid, StudentBO bo) {
        try (Connection connection = ds.getConnection();
             PreparedStatement pstm = connection.prepareStatement(SQL_SELECT_QUERY)) {
            pstm.setInt(1, sid);
            try (ResultSet res = pstm.executeQuery()) {
                while (res.next()) {
                    System.out.println("Select operation is started ::");
                    System.out.println("sid"+" "+"sname"+" "+"pmt"+" "+"rate"+" "+"time"+" "+"SI");
                           System.out.println( res.getInt(1)+"  "+ res.getString(2)+"  " +res.getInt(3)+"  "
                        		   +res.getInt(4)+"  " +res.getInt(5)+"  "+ res.getInt(6));
                }
            }
        } catch (SQLException e) {
  e.printStackTrace();
        }
    }
}
