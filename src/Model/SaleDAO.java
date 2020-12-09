package Model;

import config.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SaleDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement pStatement;
    ResultSet resSet;
    int r;

    public String GenerateSaleNum(){
        String saleNum ="";
        String sql = "select max(SerialNumber) from sale";
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()){
                saleNum = resSet.getString(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return saleNum;
    }

    public String IdSale(){
        String idSale ="";
        String sql = "select max(idSale) from sale";
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()){
                idSale = resSet.getString(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return idSale;
    }

    public int saveSale(Sale sale){
        String sql = "insert into sale(IdClient, IdEmployee, SerialNumber,SaleDate, Amount, State) values(?,?,?,?,?,?)";
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setInt(1, sale.getIdClient());
            pStatement.setInt(2, sale.getIdEmployee());
            pStatement.setString(3, sale.getSerialNumber());
            pStatement.setString(4, sale.getDate());
            pStatement.setDouble(5, sale.getPrice());
            pStatement.setString(6, sale.getState());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public int saveDetailsSale(Sale sale){
        String sql = "insert into sales_detail(IdSale,idProduct,Quantity,Price) values(?,?,?,?)";
        System.out.println(sale.getId() + " " + sale.getIdProduct() + " " +sale.getQuantity() + " " + sale.getPrice());
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setInt(1, sale.getId());
            pStatement.setInt(2, sale.getIdProduct());
            pStatement.setInt(3, sale.getQuantity());
            pStatement.setDouble(4, sale.getPrice());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }
}
