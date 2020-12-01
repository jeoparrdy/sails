package Model;

import config.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement pStatement;
    ResultSet resSet;
    int r;

    public Product search(int id){
        Product product = new Product();
        String sql = "select * from product where IdProduct="+id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()) {
                product.setId(resSet.getInt("IdProduct"));
                product.setName(resSet.getString("Name"));
                product.setPrice(resSet.getDouble("Price"));
                product.setStock(resSet.getInt("Stock"));
                product.setState(resSet.getString("State"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public int updateStock(int id, int stock){
        String sql ="update product set Stock=? where IdProduct=?";
        try {
            con =cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setInt(1,stock);
            pStatement.setInt(2, id);
            pStatement.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    //CRUD operations
    public List list(){
        String sql = "select * from product";
        List<Product> productList = new ArrayList<>();
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()) {
                Product product = new Product();
                product.setId(resSet.getInt("IdProduct"));
                product.setName(resSet.getString("Name"));
                product.setPrice(resSet.getDouble("Price"));
                product.setStock(resSet.getInt("Stock"));
                product.setState(resSet.getString("State"));

                productList.add(product);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public Product listId(int id){
        Product product = new Product();
        String sql = "select * from product where IdProduct="+id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            resSet = pStatement.executeQuery();
            while (resSet.next()) {
                product.setId(resSet.getInt("IdProduct"));
                product.setName(resSet.getString("Name"));
                product.setPrice(resSet.getDouble("Price"));
                product.setStock(resSet.getInt("Stock"));
                product.setState(resSet.getString("State"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public int add(Product product){
        String sql = "insert into product (Name, Price, Stock, State) values(?,?,?,?)";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, product.getName());
            pStatement.setDouble(2, product.getPrice());
            pStatement.setInt(3, product.getStock());
            pStatement.setString(4, product.getState());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public int update(Product product){
        String sql = "update employee set Name=?, Price=?, Stock=?, State=? where IdCLient=?";
        try {
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, product.getName());
            pStatement.setDouble(2, product.getPrice());
            pStatement.setInt(3, product.getStock());
            pStatement.setString(4, product.getState());
            pStatement.setInt(5, product.getId());
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }

    public void delete(int id){
        String sql = "delete from product where IdProduct="+ id;
        try{
            con = cn.Connect();
            pStatement = con.prepareStatement(sql);
            pStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
