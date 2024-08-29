package in.pwskill.nikhil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentBO;

@Component("dao")
public class StudentdaoImpl implements Istudentdao {
    private final String SQL_INSERT_QUERY = "insert into springjd values(?,?,?,?,?,?,?,?)";
    int count = 0;

    @Autowired
    private DataSource datasource;

    @Override
    public String insertApp(StudentBO bo) {
        try (Connection connection = datasource.getConnection();
             PreparedStatement pstm = connection.prepareStatement(SQL_INSERT_QUERY)) {
            pstm.setString(1, bo.getSaddress());
            pstm.setInt(2, bo.getPmt());
            pstm.setInt(3, bo.getRate());
            pstm.setInt(4, bo.getTime());
            pstm.setInt(5, bo.getSage());
            pstm.setInt(6, bo.getSid());
            pstm.setString(7, bo.getSname());
            pstm.setInt(8, bo.getSi());
            count = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count == 0 ? "Record not inserted" : "Record inserted successfully";
    }
}
