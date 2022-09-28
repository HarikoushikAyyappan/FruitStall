package com.stall.service;
import com.stall.dao.DaoImplementation;
import com.stall.model.Fruits;
import com.stall.model.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.sql.*;

public class SqlConnection {
    Person person = new Person();
     DaoImplementation daoImplementation = new DaoImplementation();
    public  Person connectionFunction(Person person) throws SQLException {
        return daoImplementation.personPostFunction(person);
    }
    public Person personPutFunction(@RequestBody Person person) throws IOException, SQLException, ClassNotFoundException {
        return daoImplementation.personPutFunction(person);
    }
    public Person personGetFunction( String id) throws IOException{
        return daoImplementation.personGetFunction(id);
    }
    public void deletePersonFunction( String id) throws IOException, SQLException {
        daoImplementation.deletePersonFunction(id);
    }
}

