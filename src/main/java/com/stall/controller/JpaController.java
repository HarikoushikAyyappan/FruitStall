package com.stall.controller;
import java.util.List;
import java.util.Optional;

import com.stall.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.stall.model.PersonEntity;
import com.stall.dao.DataRepository;
@RestController
@RequestMapping(value = "/PersonDetails")

public class JpaController {
    @Autowired
    private JpaService jpaService;
    /*JpaService jpaService =new JpaService();*/
    @GetMapping(value = "/allPersons")
    public List<PersonEntity> getAllPersons(){
        return jpaService.getAllEmployees();
    }
    @PostMapping("/postPerson")
    public PersonEntity createOrSavePerson(@RequestBody PersonEntity personEntity) {
        return jpaService.createOrSavePerson(personEntity);
}
    @GetMapping(value = "/getPerson/{id}")
    public Optional<PersonEntity> getPersonById(@PathVariable long id) {
        return jpaService.getPerson(id);
    }
    @PutMapping("/putPerson/{id}")
    PersonEntity updatePerson(@RequestBody PersonEntity personEntity, @PathVariable Long id){
        return jpaService.updatePerson(personEntity,id);
    }
    @DeleteMapping("/deletePerson/{id}")
    void deleteEmployee(@PathVariable Long id) {
        jpaService.deletePerson(id);
    }
}
