/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author prach
 */
public class PersonDirectory {
    
    private ArrayList<Person> person;

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
    public PersonDirectory(){
        this.person=new ArrayList<Person>();
        
    }
    
    public Person addPerson(){
        Person a=new Person();
        person.add(a);
        return a;
        
    }
    public void deletePerson(Person account){
        person.remove(account);
    }
    public Person searchPerson(String query){
        
        for (Person person1 : person) {
            if (person1.getFirstName().equalsIgnoreCase(query) ||
                person1.getLastName().equalsIgnoreCase(query) ||
                person1.getHomeAddress().getStreetaddress().equalsIgnoreCase(query)) {
                return person1;
            }
        }
        return null; 
    }
    
    
}
