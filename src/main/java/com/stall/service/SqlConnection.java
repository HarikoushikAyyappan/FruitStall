package com.stall.service;
import com.stall.model.Person;

import java.sql.*;

public class SqlConnection {
    Person person = new Person();
    public static Person connectionFunction(Person person){
  try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/person","root","HkSkmysql1*");
        Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery( "insert into person values(" +person.getId()+ ", '" + person.getName()+
              "', " +person.getAge()+ ", " +person.getMobile()+ ")");
        /*ResultSet rs=stmt.executeQuery("INSERT INTO person VALUES");
        while(rs.next())
            System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getInt("age")+" "+rs.getLong("mobile"));
        con.close();*/
      con.close();
    }catch(Exception e){ System.out.println(e);}
  return person;
}

}

