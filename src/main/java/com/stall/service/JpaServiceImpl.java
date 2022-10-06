package com.stall.service;

import com.stall.dao.DataRepository;
import com.stall.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class JpaServiceImpl implements JpaService {
    @Autowired
    private DataRepository dataRepository;

    @Transactional
    public List<PersonEntity> getAllEmployees() {
        return dataRepository.findAll();
    }

    @Transactional
    public PersonEntity createOrSavePerson(PersonEntity personEntity) {
        return dataRepository.save(personEntity);
    }

    @Transactional
    public Optional<PersonEntity> getPerson(long id) {
        return dataRepository.findById(id);
    }

    @Transactional
    public PersonEntity updatePerson(PersonEntity personEntity, Long id) {
        return dataRepository.save(personEntity);


    }

    @Transactional
    public void deletePerson(Long id) {
        dataRepository.deleteById(id);
    }
}
