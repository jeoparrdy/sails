package Model;

import config.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployerDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement pStatement;
    ResultSet resSet;

    public Employer validate(String user, String number){
        Employer employer = new Employer();
        String sql = "select * from employer where User=? and Number=?";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1,user);
            pStatement.setString(2,number);
            resSet = pStatement.executeQuery();
            while (resSet.next()){
                employer.setId(resSet.getInt("IdEmployer"));
                employer.setUser(resSet.getString("User"));
                employer.setDocum(resSet.getString("Number"));
                employer.setName(resSet.getString("Name"));

            }
        }catch (Exception e){

        }
        return employer;
    }

}
