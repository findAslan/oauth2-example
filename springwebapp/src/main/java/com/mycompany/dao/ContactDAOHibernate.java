package com.mycompany.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Repository;

import com.mycompany.Contact;


@Repository
@Transactional
public class ContactDAOHibernate implements ContactDAO{
	protected final Log logger = LogFactory.getLog(getClass());

	@PersistenceContext
    private EntityManager em;
	
	public void insertContact(Contact contact) {
		logger.debug("Inside ContactDAOHibernate.insert() method");
		em.persist(contact);
	}
	
	public List getContacts() {
		logger.debug("Inside ContactDAOHibernate.getContacts() method");
		Query query = em.createQuery("select distinct contact from Contact contact order by contact.contactId");
		List list = query.getResultList();
		return list;
	}
	
	public Contact getContact(int contactId) {
		logger.debug("Inside ContactDAOHibernate.getContact() method");
		return (Contact)em.find(Contact.class, contactId);
	}
	
	public void updateContact(Contact contact) {
		logger.debug("Inside ContactDAOHibernate.updateContact() method");
		this.em.refresh(contact);
	}
	
	public void deleteContact(int contactId) {
		logger.debug("Inside ContactDAOHibernate.deleteContact() method");
		Contact c = (Contact)em.find(Contact.class, contactId);
		if (c!=null) this.em.remove(c);
		else logger.debug("Inside ContactDAOHibernate.deleteContact() method no such id found");
	}
	
}
