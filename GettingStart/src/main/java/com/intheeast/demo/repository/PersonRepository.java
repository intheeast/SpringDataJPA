package com.intheeast.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.Repository;

import com.intheeast.demo.entity.Person;

public interface PersonRepository extends ListCrudRepository<Person, Long> {
	
	Person save(Person person);

	Optional<Person> findById(long id);
}