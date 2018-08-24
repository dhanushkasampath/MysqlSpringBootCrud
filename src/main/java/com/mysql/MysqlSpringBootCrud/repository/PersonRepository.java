package com.mysql.MysqlSpringBootCrud.repository;

import com.mysql.MysqlSpringBootCrud.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
    public Person findByFirstName(String firstName);
}
