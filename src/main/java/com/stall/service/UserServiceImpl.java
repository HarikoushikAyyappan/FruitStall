package com.stall.service;

import com.stall.dao.CustomerRepository;
import com.stall.dao.DataRepository;
import com.stall.model.Customer;
import com.stall.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
public class UserServiceImpl implements UserService {
    @Autowired
    private DataRepository dataRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public List<PersonEntity> getAllPersons() {
        return (List<PersonEntity>)dataRepository.findAll();
    }

    @Transactional
    public PersonEntity createOrSavePerson(PersonEntity personEntity) {
        return dataRepository.save(personEntity);
    }

    @Transactional
    public PersonEntity getPerson(long id) {
        return dataRepository.findById(id).get();
    }

    @Transactional
    public PersonEntity updatePerson(PersonEntity personEntity) {
        return dataRepository.save(personEntity);


    }

    @Transactional
    public void deletePerson(Long id) {
        dataRepository.deleteById(id);
    }
   /* @Transactional
    public List<PersonEntity> search(String keyword) {
        return dataRepository.search(keyword);
    }*/
   @Transactional
    public Customer updateCustomer(Customer customer){
       return customerRepository.save(customer);
   }

}
