package com.stall.controller;
import java.sql.SQLException;
import java.util.Properties;
import java.io.*;
import com.stall.model.Fruits;
import com.stall.model.Person;
import com.stall.service.FruitService;
import com.stall.service.SqlConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping(value ="/person")
public class PersonController {
    SqlConnection sqlConnection = new SqlConnection();
    @RequestMapping (value = "/postPerson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Person connectionFunction(@RequestBody Person person) throws IOException, SQLException {
        return sqlConnection.connectionFunction(person);
    }
    @RequestMapping(value = "/putPerson", method = RequestMethod.PUT)
    public Person personPutFunction(@RequestBody Person person) throws IOException, SQLException, ClassNotFoundException {
        return sqlConnection.personPutFunction(person);
}
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person personGetFunction(@PathVariable String id) throws IOException{
        return sqlConnection.personGetFunction(id);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deletePersonFunction(@PathVariable("id") String id) throws IOException, SQLException {
        sqlConnection.deletePersonFunction(id);

    }
}
