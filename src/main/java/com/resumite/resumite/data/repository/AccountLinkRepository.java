package com.resumite.resumite.data.repository;

import com.resumite.resumite.data.entity.AccountLink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountLinkRepository extends CrudRepository<AccountLink, Long> {

}
