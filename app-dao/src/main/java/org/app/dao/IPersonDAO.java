package org.app.dao;

import org.app.pojo.Person;

import com.mongodb.WriteResult;

public interface IPersonDAO {

	public void create(Person p);
	
	public Person readById(String id);
	
	public void update(Person p);
	
	public WriteResult deleteById(String id);
}
