package com.stall.dao;

import com.stall.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public
interface DataRepository extends JpaRepository<PersonEntity, Long> {


    }

