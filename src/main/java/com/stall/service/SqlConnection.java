//service layer code for establishing jdbc connection without jpa
package com.stall.service;
import com.stall.dao.DaoImplementation;
import com.stall.model.Person;
import java.io.IOException;
import java.sql.*;
public class SqlConnection {
    Person person = new Person();
     DaoImplementation daoImplementation = new DaoImplementation();
    public  Person connectionFunction(Person person) throws SQLException {
        return daoImplementation.personPostFunction(person);
    }
    public Person personPutFunction( Person person) throws IOException, SQLException, ClassNotFoundException {
        return daoImplementation.personPutFunction(person);
    }
    public Person personGetFunction( String id) throws IOException{
        return daoImplementation.personGetFunction(id);
    }
    public void deletePersonFunction( String id) throws IOException, SQLException {
        daoImplementation.deletePersonFunction(id);
    }
}

