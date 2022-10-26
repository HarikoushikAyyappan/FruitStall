//service layer code for rest api with jsp,jpa and jdbc
package com.stall.service;
import com.stall.model.Customer;
import com.stall.model.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public interface UserService {
    List<PersonEntity> getAllPersons();

     PersonEntity createOrSavePerson(PersonEntity personEntity);

     PersonEntity getPerson(long id);

     PersonEntity updatePerson(PersonEntity personEntity);

     void deletePerson(Long id);
    Customer updateCustomer(Customer customer);

}
