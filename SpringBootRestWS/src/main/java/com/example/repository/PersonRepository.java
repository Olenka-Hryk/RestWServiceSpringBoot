package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
	public Person findByEmail(String email);
	/**public Person findUsingEmail(String email);***/
}
