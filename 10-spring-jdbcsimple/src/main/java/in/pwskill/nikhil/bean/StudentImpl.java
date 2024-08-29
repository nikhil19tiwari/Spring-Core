package in.pwskill.nikhil.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mysqlDao")
public class StudentImpl implements Istudent {
    private static final String SQL_GET_QUERY = "select * from std";

    @Autowired
    private DataSource ds;

    @Override
    public void getConnection() {
        try (Connection connection = ds.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL_GET_QUERY)) {

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                        + resultSet.getInt(3) + " " + resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
