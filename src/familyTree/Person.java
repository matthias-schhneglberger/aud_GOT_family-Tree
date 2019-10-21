/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Matthias
 */
public class Person {
    private boolean male;
    private Person dad;
    private Person mom;
    private List<Person> children;

    public Person(boolean male, Person dad, Person mom, List<Person> children) {
        this.male = male;
        this.dad = dad;
        this.mom = mom;
        this.children = children;
    }

    public Person(boolean male, Person dad, List<Person> children) {
        this.male = male;
        this.dad = dad;
        this.children = children;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Person getDad() {
        return dad;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    public Person getMom() {
        return mom;
    }

    public void setMom(Person mom) {
        this.mom = mom;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
    

    
    public boolean getMale(){
        return male;
    }
    
    public List<Person> getParents(){
        List<Person> parents = new ArrayList<Person>();
        parents.add(mom);
        parents.add(dad);
        return parents;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.male ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.dad);
        hash = 97 * hash + Objects.hashCode(this.mom);
        hash = 97 * hash + Objects.hashCode(this.children);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.male != other.male) {
            return false;
        }
        if (!Objects.equals(this.dad, other.dad)) {
            return false;
        }
        if (!Objects.equals(this.mom, other.mom)) {
            return false;
        }
        if (!Objects.equals(this.children, other.children)) {
            return false;
        }
        return true;
    }
    
    
    
}
