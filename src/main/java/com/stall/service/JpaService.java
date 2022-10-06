package com.stall.service;

import com.stall.model.PersonEntity;

import java.util.List;
import java.util.Optional;

public interface JpaService {
    List<PersonEntity> getAllEmployees();

     PersonEntity createOrSavePerson(PersonEntity personEntity);

     Optional<PersonEntity> getPerson(long id);

     PersonEntity updatePerson(PersonEntity personEntity, Long id);

     void deletePerson(Long id);
}
