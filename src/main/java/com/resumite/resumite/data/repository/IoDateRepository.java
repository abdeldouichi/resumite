package com.resumite.resumite.data.repository;

import com.resumite.resumite.data.entity.IoDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IoDateRepository extends CrudRepository<IoDate, Long> {

}
