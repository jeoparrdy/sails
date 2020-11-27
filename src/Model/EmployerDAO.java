package Model;

import config.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployerDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement pStatement;
    ResultSet resSet;
    int r;
    public Employer validate(String user, String number){
        Employer employer = new Employer();
        String sql = "select * from employee where Number=? and User=?";
        try {
            con = cn.Connect();

            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, number);
            pStatement.setString(2, user);
            resSet = pStatement.executeQuery();

            while (resSet.next()){
                employer.setId(resSet.getInt("IdEmployee"));
                employer.setUser(resSet.getString("User"));
                employer.setNumber(resSet.getString("Number"));
                employer.setName(resSet.getString("Name"));

            }
        }catch (Exception e){
            e.printStackTrace();

        }
        return employer;
    }

    //CRUD operations
    public List list(){
        String sql = "select * from employee";
        List<Employer> employerList = new ArrayList<>();
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()){
                Employer employer = new Employer();
                employer.setId(resSet.getInt(1));
                employer.setNumber(resSet.getString(2));
                employer.setName(resSet.getString(3));
                employer.setPhone(resSet.getString(4));
                employer.setState(resSet.getString(5));
                employer.setUser(resSet.getString(6));

                employerList.add(employer);

            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return employerList;
    }

    public int add(Employer employer){
        String sql = "insert into employee(Number, Name, Phone, State, User) values(?,?,?,?,?)";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, employer.getNumber());
            pStatement.setString(2, employer.getName());
            pStatement.setString(3, employer.getPhone());
            pStatement.setString(4, employer.getState());
            pStatement.setString(5, employer.getUser());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public Employer listId(int id){
        Employer employer = new Employer();
        String sql = "select * from employee where IdEmployee=" + id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()){
                employer.setNumber(resSet.getString(2));
                employer.setName(resSet.getString(3));
                employer.setPhone(resSet.getString(4));
                employer.setState(resSet.getString(5));
                employer.setUser(resSet.getString(6));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return employer;
    }

    public int update(Employer employer){
        String sql = "update employee set Number=?, Name=?, Phone=?, State=?, User=? where IdEmployee=?";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, employer.getNumber());
            pStatement.setString(2, employer.getName());
            pStatement.setString(3, employer.getPhone());
            pStatement.setString(4, employer.getState());
            pStatement.setString(5, employer.getUser());
            pStatement.setInt(6, employer.getId());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public void delete(int id){
        String sql = "delete from employee where IdEmployee=?"+ id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
