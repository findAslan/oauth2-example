
package com.mycompany.dao;

import java.util.List;

import com.mycompany.Contact;


/**
 * @author testuser
 * Interface defining all business methods for interacting with CONTACT Table
 */
public interface ContactDAO {
	/*
	 * Method call for inserting new contact
	 */
	public void insertContact(Contact contact);
	
	/*
	 * Method call for getting list of existing contacts
	 */
	public List getContacts();
	
	/*
	 * Method call for getting contact with supplied contactId 
	 */
	public Contact getContact(int contactId);
	/*
	 * Method call for updating contact
	 */
	public void updateContact(Contact contact);
	/*
	 * Method call for deleting contact with supplied contactId
	 */
	public void deleteContact( int contactId);
}
