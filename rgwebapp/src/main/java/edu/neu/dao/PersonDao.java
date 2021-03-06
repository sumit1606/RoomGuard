package edu.neu.dao;


import java.util.List;

import edu.neu.model.Person;

public interface PersonDao {
    public Person addperson (Person p);
    public void updatePerson (Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
	public Person findAccountByEmail(String emailAddress);
}
