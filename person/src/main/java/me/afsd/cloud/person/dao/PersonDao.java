package me.afsd.cloud.person.dao;

import me.afsd.cloud.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@Repository
public interface PersonDao extends JpaRepository<Person,Long>,JpaSpecificationExecutor<Person> {
}
