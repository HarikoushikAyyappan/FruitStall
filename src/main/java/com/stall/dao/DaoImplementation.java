package com.stall.dao;

import com.stall.model.Person;

import java.io.IOException;
import java.sql.*;

public  class DaoImplementation {
    Person person = new Person();
    public  Person personPostFunction(Person person) throws SQLException {

        Connection con = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fruitstall", "root", "HkSkmysql1*");
            //specify the INSERT statement
            stmt = con.prepareStatement("INSERT into person" + " VALUES(?,?,?,?)");

// SET the values in your table columns
            stmt.setInt(1, person.getId());
            stmt.setString(2, person.getName());
            stmt.setInt(3, person.getAge());
            stmt.setLong(4, person.getMobile());

//EXECUTE the update
            stmt.executeUpdate();
        }// End of TRY block

        catch (Exception e) {
            System.err.println("Error: ");
            e.printStackTrace(System.err);
        }

// CLOSE the Statement and Connection objects
        finally {
            stmt.close();
            con.close();
        }
      return person;
    }
    public Person personPutFunction(Person person) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement statement = null;
        //PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fruitstall", "root", "HkSkmysql1*");
            //specify the INSERT statement
            String sql = "UPDATE person SET age=?, name=?, mobile=? WHERE id=?";

            statement = connection.prepareStatement(sql);
            statement.setInt(1, person.getId());
            statement.setString(2, person.getName());
            statement.setInt(3, person.getAge());
            statement.setLong(4, person.getMobile());

            statement.executeUpdate();

        }
        catch (Exception e) {
            System.err.println("Error: ");
            e.printStackTrace(System.err);
            }

// CLOSE the Statement and Connection objects
        finally {
            statement.close();
            connection.close();
        }
        return person;

    }
public Person personGetFunction(String id){
    Connection con1 = null;
    //PreparedStatement statement = null;
    Statement stmt1 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
         con1=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fruitstall","root","HkSkmysql1*");
//here sonoo is database name, root is username and password
         stmt1= con1.createStatement();
        ResultSet rs=stmt1.executeQuery("select * from emp");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        con1.close();
    }
    catch(Exception e){
        System.out.println(e);}
    return person;
}
    public void deletePersonFunction( String id) throws IOException, SQLException {
        Connection connection1 = null;
        //PreparedStatement statement = null;
        PreparedStatement statement1 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection1 = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fruitstall", "root", "HkSkmysql1*");
            String sql = "DELETE FROM person WHERE id=?";

             statement1 = connection1.prepareStatement(sql);
            statement1.setString(1, id);

            int rowsDeleted = statement1.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A user was deleted successfully!");
            }
        }// End of TRY block

        catch (Exception e) {
            System.err.println("Error: ");
            e.printStackTrace(System.err);
        }

// CLOSE the Statement and Connection objects
        finally {
            statement1.close();
            connection1.close();
        }
    }
}
