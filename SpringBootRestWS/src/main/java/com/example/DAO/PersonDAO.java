package com.example.DAO;

import com.example.Entity.Person;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	private static Map<Integer, Person> persons;

}
