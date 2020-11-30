package Model;

import config.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement pStatement;
    ResultSet resSet;
    int r;

    public Client search(String number){
        Client client = new Client();
        String sql = "select * from client where Number="+number;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()) {
              client.setId(resSet.getInt("IdClient"));
              client.setName(resSet.getString("Name"));
              client.setAddress(resSet.getString("Address"));
              client.setNumber(resSet.getString("Number"));
              client.setState(resSet.getString("State"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }

    //CRUD operations
    public List list(){
        String sql = "select * from client";
        List<Client> clientList = new ArrayList<>();
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()) {
                Client client = new Client();
                client.setId(resSet.getInt("IdClient"));
                client.setName(resSet.getString("Name"));
                client.setAddress(resSet.getString("Address"));
                client.setNumber(resSet.getString("Number"));
                client.setState(resSet.getString("State"));

                clientList.add(client);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return clientList;
    }

    public Client listId(int id){
        Client client = new Client();
        String sql = "select * from client where IdClient=" + id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()){
                client.setNumber(resSet.getString(2));
                client.setName(resSet.getString(3));
                client.setAddress(resSet.getString(4));
                client.setState(resSet.getString(5));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return client;
    }

    public int add(Client client){
        String sql = "insert into employee(Number, Name, Address, State) values(?,?,?,?)";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, client.getNumber());
            pStatement.setString(2, client.getName());
            pStatement.setString(3, client.getAddress());
            pStatement.setString(4, client.getState());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public int update(Client client){
        String sql = "update employee set Number=?, Name=?, Address=?, State=? where IdCLient=?";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, client.getNumber());
            pStatement.setString(2, client.getName());
            pStatement.setString(3, client.getAddress());
            pStatement.setString(4, client.getState());
            pStatement.setInt(5, client.getId());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public void delete(int id){
        String sql = "delete from client where IdClient="+ id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
