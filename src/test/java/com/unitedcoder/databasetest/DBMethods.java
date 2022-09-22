package com.unitedcoder.databasetest;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class DBMethods {
    /*
Execute Query: How to execute SQL scripts?
1.Create a SQL statement object instance
 */
    //get product information
    public boolean getProduct(String productName, Connection connection){
        boolean isProductExist = false;
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet cachedRowSet = null;

        try {
            cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String script = String.format("select product_id,name,price from cc_CubeCart_inventory where name='%s'",productName);
        try {
            resultSet = statement.executeQuery(script);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (cachedRowSet==null){
            System.out.println("No records fun");
            return isProductExist;
        }else {
            try {
                cachedRowSet.populate(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        int count = 0;
        while (true){
            try {
                if (!cachedRowSet.next()){
                    break;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            int product_id = 0;
            try {
                product_id = cachedRowSet.getInt("product_id");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            String name = null;
            try {
                name = cachedRowSet.getString("name");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            double price = 0;
            try {
                price = cachedRowSet.getDouble("price");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("product_id=%d name=%s price=%.2f",
                    product_id,name,price));//get product information
            try {
                count = cachedRowSet.getRow();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Total Rows" + count);
        }
        if (count > 1){
            isProductExist = true;
        }
        return isProductExist;

    }
    public boolean getCustomerInfo(String customerEmail,Connection connection){
        boolean isCustomerExist = false;
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet cachedRowSet = null;

        try {
            cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String script = String.format("select customer_id,email from cc_CubeCart_customer where email='%s'",customerEmail);
        try {
            resultSet = statement.executeQuery(script);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (cachedRowSet==null){
            System.out.println("No records fun");
            return isCustomerExist;
        }else {
            try {
                cachedRowSet.populate(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        int count = 0;
        while (true){
            try {
                if (!cachedRowSet.next()){
                    break;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            int customer_id = 0;
            try {
                customer_id = cachedRowSet.getInt("customer_id");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String email = null;
            try {
                email = cachedRowSet.getString("email");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("customer_id=%d email=%s",
                    customer_id,email));//get customer information
            try {
                count = cachedRowSet.getRow();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Total Rows" + count);
        }
        if (count >= 1){
            isCustomerExist = true;
        }
        return isCustomerExist;


    }

    //insert data
    public boolean insertNewCategory(CategoryObject categoryObject,Connection connection){
        String sqlScript = "insert into cc_CubeCart_category"+"(cat_name,cat_desc,cat_parent_id,cat_image,per_ship,seo_meta_title,seo_meta_description,seo_meta_keywords,"+
                "priority,status)values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sqlScript);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            preparedStatement.setString(1, categoryObject.getCat_name());
            preparedStatement.setString(2, categoryObject.getCat_desc());
            preparedStatement.setInt(3, categoryObject.getCat_parent_id());
            preparedStatement.setInt(4, categoryObject.getCat_image());
            preparedStatement.setInt(5, categoryObject.getPer_ship());
            preparedStatement.setString(6, categoryObject.getSeoMetaTitle());
            preparedStatement.setString(7, categoryObject.getSeoMetaDescription());
            preparedStatement.setString(8, categoryObject.getSeoMetaKeyword());
            preparedStatement.setInt(9, categoryObject.getPriority());
            preparedStatement.setInt(10, categoryObject.getStatus());
        }catch (SQLException e){
            e.printStackTrace();
        }
        int affectedRowCount=0;
        try {
            affectedRowCount = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (affectedRowCount>=1){
            System.out.println("Values Inserted successfully");
            return true;
        }
        else {
            return false;
        }
    }

    //verify
    public boolean verifyCategoryInsertedSuccessfully(String categoryName,Connection connection){
        return true;
    }

    //delete data
    public boolean deleteCategory(String categoryName,Connection connection){
        String deleteQuery = "delete from cc_CubeCart_category where cat_name=?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(deleteQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            preparedStatement.setString(1,categoryName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int affectedRows = 0;
        try {
            affectedRows=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%d of rows affected",affectedRows));
        if (affectedRows>=1){
            return true;
        }else {
            return false;
        }
    }

}