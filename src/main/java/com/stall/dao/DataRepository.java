//dao layer code for rest api with jdbc,jpa and jsp.
package com.stall.dao;
import com.stall.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public
interface DataRepository extends JpaRepository<PersonEntity, Long> {


    }

