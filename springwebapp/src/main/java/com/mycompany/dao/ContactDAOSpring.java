package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.Contact;

public interface ContactDAOSpring extends CrudRepository<Contact, Integer> {

}
