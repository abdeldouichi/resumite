package com.resumite.resumite.data.repository;

import com.resumite.resumite.data.entity.SectionInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionInfoRepository extends CrudRepository<SectionInfo, Long> {

}